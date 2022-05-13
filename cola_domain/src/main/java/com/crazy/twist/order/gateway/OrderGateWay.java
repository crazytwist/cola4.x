package com.crazy.twist.order.gateway;

import com.crazy.twist.order.model.aggregates.OrderEntity;

/**
 * @ClassName OrderGateWay
 * @Author mengke
 * @create 2022/5/7 01:11
 * @Description 订单网关
 */
public interface OrderGateWay {

    public OrderEntity getById(String orderId);


    public void createOrder(OrderEntity orderEntity);
}
