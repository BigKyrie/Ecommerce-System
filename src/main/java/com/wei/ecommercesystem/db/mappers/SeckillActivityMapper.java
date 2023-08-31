package com.wei.ecommercesystem.db.mappers;

import com.wei.ecommercesystem.db.po.SeckillActivity;

public interface SeckillActivityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SeckillActivity row);

    int insertSelective(SeckillActivity row);

    SeckillActivity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SeckillActivity row);

    int updateByPrimaryKey(SeckillActivity row);
}