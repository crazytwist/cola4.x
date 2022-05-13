package com.crazy.twist.order.extensionpoint;

import com.alibaba.cola.extension.ExtensionPointI;
import com.crazy.twist.order.model.aggregates.OrderEntity;

/**
 * @ClassName OrderValidateExtPt
 * @Author mengke
 * @create 2022/5/11 22:56
 * @Description 订单校验
 */
public interface OrderValidateExtPt extends ExtensionPointI {

    public void validate(OrderEntity orderEntity);
}
