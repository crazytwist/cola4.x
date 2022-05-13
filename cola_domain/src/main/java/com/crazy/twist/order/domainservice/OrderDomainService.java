package com.crazy.twist.order.domainservice;

import com.crazy.twist.order.model.aggregates.OrderEntity;

/**
 * @ClassName OrderDomainService
 * @Author mengke
 * @create 2022/5/13 01:29
 * @Description
 */
public interface OrderDomainService {

    public void createOrderEntity(OrderEntity orderEntity);
}
