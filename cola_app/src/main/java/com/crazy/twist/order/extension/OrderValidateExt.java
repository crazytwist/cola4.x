package com.crazy.twist.order.extension;

import com.alibaba.cola.extension.Extension;
import com.crazy.twist.order.constant.Constants;
import com.crazy.twist.order.extensionpoint.OrderValidateExtPt;
import com.crazy.twist.order.model.aggregates.OrderEntity;

/**
 * @ClassName OrderValidateExt
 * @Author mengke
 * @create 2022/5/12 20:16
 * @Description
 */
@Extension(bizId = Constants.BIZ_TOB, useCase = Constants.USE_CASE_ZD_PORK, scenario = Constants.ORDER_PREVIEW)
public class OrderValidateExt implements OrderValidateExtPt {

    @Override
    public void validate(OrderEntity orderEntity) {

    }
}
