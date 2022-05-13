package com.crazy.twist.order.extension;

import com.alibaba.cola.extension.Extension;
import com.crazy.twist.dto.qry.OrderPreviewQry;
import com.crazy.twist.order.model.aggregates.OrderEntity;
import com.crazy.twist.order.constant.Constants;
import com.crazy.twist.order.extensionpoint.OrderPreviewConvertorExtPt;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName OrderPreviewConvertorExt
 * @Author mengke
 * @create 2022/5/6 23:38
 * @Description 业务含义  tob业务  细分为猪肉领域 最终为批发方式
 */
@Extension(bizId = Constants.BIZ_TOB, useCase = Constants.USE_CASE_ZD_PORK, scenario = Constants.ORDER_PREVIEW)
public class OrderPreviewConvertorExt implements OrderPreviewConvertorExtPt {

    @Override
    public OrderEntity clientToEntity(OrderPreviewQry orderPreviewQry) {
        System.out.println("[数据转换] : tob 业务 下 猪肉 的 渠道方式 ");
        String channel = orderPreviewQry.getOrderDTO().getChannel().equals("10001") ? "线上团购" : "线下购买";
        return OrderEntity.builder().build();
    }
}
