package com.crazy.twist.order.extension;

import com.alibaba.cola.extension.Extension;
import com.crazy.twist.dto.data.OrderDTO;
import com.crazy.twist.order.constant.Constants;
import com.crazy.twist.order.extensionpoint.OrderCreateConvertorExtPt;
import com.crazy.twist.order.model.aggregates.OrderEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName OrderCreateConvertExt
 * @Author mengke
 * @create 2022/5/13 01:18
 * @Description
 */
@Extension(bizId = Constants.BIZ_TOB, useCase = Constants.USE_CASE_ZD_PORK, scenario = Constants.ORDER_CREATE)
public class OrderCreateConvertExt implements OrderCreateConvertorExtPt {

    Logger logger = LoggerFactory.getLogger(OrderCreateConvertExt.class);

    @Override
    public OrderEntity toDomainObject(OrderDTO orderDTO) {
        logger.info("04 将 传输对象 dto 转换成 领域对象 entity");
        return OrderEntity.builder()
                .orderId(orderDTO.getOrderId())
                .createdAt(orderDTO.getOrderAt())
                .build();
    }
}
