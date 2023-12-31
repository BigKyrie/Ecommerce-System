package com.wei.ecommercesystem.service;

import com.wei.ecommercesystem.db.dao.SeckillActivityDao;
import com.wei.ecommercesystem.db.po.SeckillActivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: Ecommerce-System
 * @description:
 * @create: 2023-09-03 18:15
 */
@Service
public class SeckillOverSellService {
    @Autowired
    private SeckillActivityDao seckillActivityDao;

    public String  processSeckill(long activityId) {
        SeckillActivity seckillActivity = seckillActivityDao.querySeckillActivityById(activityId);
        long availableStock = seckillActivity.getAvailablestock();
        String result;
        if (availableStock > 0) {
            result = "恭喜，抢购成功";
            System.out.println(result);
            availableStock = availableStock - 1;
            seckillActivity.setAvailablestock(new Integer("" + availableStock));
            seckillActivityDao.updateSeckillActivity(seckillActivity);
        } else {
            result = "抱歉，抢购失败，商品被抢完了";
            System.out.println(result);
        }
        return result;
    }
}
