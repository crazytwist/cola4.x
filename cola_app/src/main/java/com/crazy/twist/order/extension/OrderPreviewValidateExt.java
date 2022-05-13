package com.crazy.twist.order.extension;

import com.alibaba.cola.exception.BizException;
import com.alibaba.cola.extension.Extension;
import com.crazy.twist.dto.qry.OrderPreviewQry;
import com.crazy.twist.order.constant.Constants;
import com.crazy.twist.order.extensionpoint.OrderPreviewValidateExtPt;

/**
 * @ClassName OrderPreviewValidateExt
 * @Author mengke
 * @create 2022/5/7 00:42
 * @Description
 */
@Extension(bizId = Constants.BIZ_TOB, useCase = Constants.USE_CASE_ZD_PORK, scenario = Constants.ORDER_PREVIEW)
public class OrderPreviewValidateExt implements OrderPreviewValidateExtPt {

    @Override
    public void validate(OrderPreviewQry orderPreviewQry) {
        System.out.println("[数据校验] : tob 业务 下 猪肉 的 渠道方式 ");
        if (!orderPreviewQry.getOrderDTO().getOrderType().equals("Tob")) {
            throw new BizException("该订单非Tob订单");
        }
    }
}
