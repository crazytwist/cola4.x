package com.crazy.twist.order.extensionpoint;

import com.alibaba.cola.extension.ExtensionPointI;
import com.crazy.twist.dto.qry.OrderPreviewQry;

/**
 * @ClassName OrderPreviewValidateExtPt
 * @Author mengke
 * @create 2022/5/7 00:41
 * @Description 预览订单拓展点
 */
public interface OrderPreviewValidateExtPt extends ExtensionPointI {

    public void validate(OrderPreviewQry orderPreviewQry);
}
