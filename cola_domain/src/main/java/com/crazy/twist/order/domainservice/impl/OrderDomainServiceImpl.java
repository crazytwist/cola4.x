package com.crazy.twist.order.domainservice.impl;

import com.crazy.twist.order.domainservice.OrderDomainService;
import com.crazy.twist.order.gateway.OrderGateWay;
import com.crazy.twist.order.model.aggregates.OrderEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName OrderDomainServiceImpl
 * @Author mengke
 * @create 2022/5/13 01:29
 * @Description
 */
@Service
public class OrderDomainServiceImpl implements OrderDomainService {

    Logger logger = LoggerFactory.getLogger(OrderDomainServiceImpl.class);

    @Autowired
    private OrderGateWay orderGateWay;

    @Override
    public void createOrderEntity(OrderEntity orderEntity) {
        logger.info("05 调用网关层进行存储 订单信息 这里的 领域对象可以具有其他的操作");
        orderGateWay.createOrder(orderEntity);
    }
}
