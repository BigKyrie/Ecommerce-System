package com.wei.ecommercesystem.component;

import com.wei.ecommercesystem.db.dao.SeckillActivityDao;
import com.wei.ecommercesystem.db.po.SeckillActivity;
import com.wei.ecommercesystem.util.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: Ecommerce-System
 * @description:
 * @author: Yuheng Wei
 */
@Component
public class RedisPreheatRunner implements ApplicationRunner {
    @Autowired
    RedisService redisService;
    @Autowired
    SeckillActivityDao seckillActivityDao;
    /**
     * 启动项目时 向 Redis 存入 商品库存
     * @param args
     * @throws Exception
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<SeckillActivity> seckillActivities =
                seckillActivityDao.querySeckillActivitysByStatus(1);
        for (SeckillActivity seckillActivity : seckillActivities) {
            redisService.setValue("stock:" + seckillActivity.getId(),
                    (long) seckillActivity.getAvailablestock());
        }
    }
}
