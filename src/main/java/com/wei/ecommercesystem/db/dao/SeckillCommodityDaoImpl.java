package com.wei.ecommercesystem.db.dao;

import com.wei.ecommercesystem.db.mappers.SeckillCommodityMapper;
import com.wei.ecommercesystem.db.po.SeckillCommodity;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @program: Ecommerce-System
 * @description:
 * @author: Yuheng Wei
 */

@Repository
public class SeckillCommodityDaoImpl implements SeckillCommodityDao{
    @Resource
    private SeckillCommodityMapper seckillCommodityMapper;

    @Override
    public SeckillCommodity querySeckillCommodityById(long commodityId) {
        return seckillCommodityMapper.selectByPrimaryKey(commodityId);
    }
}
