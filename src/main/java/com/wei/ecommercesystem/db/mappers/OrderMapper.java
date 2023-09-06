package com.wei.ecommercesystem.db.mappers;

import com.wei.ecommercesystem.db.po.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Order row);

    int insertSelective(Order row);

    Order selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Order row);

    int updateByPrimaryKey(Order row);

    Order selectByOrderNo(String orderNo);
}