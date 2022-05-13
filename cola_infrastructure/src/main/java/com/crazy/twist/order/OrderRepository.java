package com.crazy.twist.order;

import org.springframework.stereotype.Repository;

/**
 * @ClassName OrderRepository
 * @Author mengke
 * @create 2022/5/7 00:49
 * @Description 数据访问层
 */
@Repository
public class OrderRepository {

    public OrderDO getById(String orderId) {
        return new OrderDO();
    }

}
