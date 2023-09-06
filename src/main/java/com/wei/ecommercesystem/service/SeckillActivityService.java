package com.wei.ecommercesystem.service;

import com.wei.ecommercesystem.util.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: Ecommerce-System
 * @description:
 * @author: Yuheng Wei
 * @create: 2023-09-04 23:17
 */
@Service
public class SeckillActivityService {
    @Autowired
    private RedisService redisService;

    /**
     * 判断商品是否还有库存
     * @param activityId 商品ID
     * @return
     */
    public boolean seckillStockValidator(long activityId) {
        String key = "stock:" + activityId;
        return redisService.stockDeductValidator(key);
    }
}
