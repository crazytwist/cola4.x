package com.crazy.twist.order.extensionpoint;

import com.alibaba.cola.extension.ExtensionPointI;
import com.crazy.twist.dto.data.OrderDTO;
import com.crazy.twist.order.model.aggregates.OrderEntity;

/**
 * @ClassName OrderCreateConvertorExtPt
 * @Author mengke
 * @create 2022/5/11 22:47
 * @Description 创建订单转换接口
 */
public interface OrderCreateConvertorExtPt extends ExtensionPointI {

    OrderEntity toDomainObject(OrderDTO orderDTO);
}
