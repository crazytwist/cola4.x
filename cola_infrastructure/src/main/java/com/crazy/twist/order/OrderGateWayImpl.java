package com.crazy.twist.order;

import com.crazy.twist.order.gateway.OrderGateWay;
import com.crazy.twist.order.model.aggregates.OrderEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName OrderGateWayImpl
 * @Author mengke
 * @create 2022/5/7 01:14
 * @Description
 */
@Component
public class OrderGateWayImpl implements OrderGateWay {

    Logger logger = LoggerFactory.getLogger(OrderGateWayImpl.class);

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public OrderEntity getById(String orderId) {
        OrderDO orderDO = orderRepository.getById(orderId);
        return null;
    }

    @Override
    public void createOrder(OrderEntity orderEntity) {
        logger.info("06 插入数据库操作");
    }
}
