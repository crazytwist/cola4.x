package com.crazy.twist.order.extensionpoint;

import com.alibaba.cola.extension.ExtensionPointI;
import com.crazy.twist.dto.qry.OrderPreviewQry;
import com.crazy.twist.order.model.aggregates.OrderEntity;

/**
 * @ClassName OrderPreviewConvertorExtPt
 * @Author mengke
 * @create 2022/5/6 23:28
 * @Description 订单预览转换拓展
 */
public interface OrderPreviewConvertorExtPt extends ExtensionPointI {

    public OrderEntity clientToEntity(OrderPreviewQry orderPreviewQry);
}
