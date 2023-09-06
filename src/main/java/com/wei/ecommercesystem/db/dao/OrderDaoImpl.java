package com.wei.ecommercesystem.db.dao;

import com.wei.ecommercesystem.db.mappers.OrderMapper;
import com.wei.ecommercesystem.db.po.Order;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @program: Ecommerce-System
 * @description:
 * @author: Yuheng Wei
 */
@Repository
public class OrderDaoImpl implements OrderDao{
    @Resource
    private OrderMapper orderMapper;
    @Override
    public void insertOrder(Order order) {
        orderMapper.insert(order);
    }
    @Override
    public Order queryOrder(String orderNo) {
        return orderMapper.selectByOrderNo(orderNo);
    }
    @Override
    public void updateOrder(Order order) {
        orderMapper.updateByPrimaryKey(order);
    }
}
