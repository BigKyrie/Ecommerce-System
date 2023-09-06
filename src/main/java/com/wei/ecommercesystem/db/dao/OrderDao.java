package com.wei.ecommercesystem.db.dao;
import  com.wei.ecommercesystem.db.po.Order;
/**
 * @description:
 * @author: Yuheng Wei
 */
public interface OrderDao {
    void insertOrder(Order order);
    Order queryOrder(String orderNo);
    void updateOrder(Order order);
}
