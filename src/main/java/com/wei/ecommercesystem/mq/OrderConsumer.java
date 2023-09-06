package com.wei.ecommercesystem.mq;

import com.alibaba.fastjson.JSON;
import com.wei.ecommercesystem.db.dao.OrderDao;
import com.wei.ecommercesystem.db.dao.SeckillActivityDao;
import com.wei.ecommercesystem.db.po.Order;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.nio.charset.StandardCharsets;
import java.util.Date;

/**
 * @program: Ecommerce-System
 * @description:
 * @author: Yuheng Wei
 */
@Slf4j
@Component
@RocketMQMessageListener(topic = "seckill_order", consumerGroup =
        "seckill_order_group")
public class OrderConsumer implements RocketMQListener<MessageExt> {
    @Autowired
    private OrderDao orderDao;
    @Autowired
    private SeckillActivityDao seckillActivityDao;
    @Override
    @Transactional
    public void onMessage (MessageExt messageExt) {
//1.解析创建订单请求消息
        String message = new String(messageExt.getBody(),
                StandardCharsets.UTF_8);
        log.info("接收到创建订单请求：" + message);
        Order order = JSON.parseObject(message, Order.class);
        order.setCreateTime(new Date());
//2.扣减库存
        boolean lockStockResult =
                seckillActivityDao.lockStock(order.getSeckillActivityId());
        if (lockStockResult) {
//订单状态 0:没有可用库存，无效订单 1:已创建等待付款
            order.setOrderStatus(1);
        } else {
            order.setOrderStatus(0);
        }
//3.插入订单
        orderDao.insertOrder(order);
    }
}
