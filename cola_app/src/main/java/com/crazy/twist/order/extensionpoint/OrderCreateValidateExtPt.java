package com.crazy.twist.order.extensionpoint;

import com.alibaba.cola.extension.ExtensionPointI;
import com.crazy.twist.dto.cmd.OrderCreateCmd;
import com.crazy.twist.dto.qry.OrderPreviewQry;

/**
 * @ClassName OrderCreateValidateExtPt
 * @Author mengke
 * @create 2022/5/11 22:46
 * @Description 创建订单校验接口
 */
public interface OrderCreateValidateExtPt extends ExtensionPointI {

    public void validate(OrderCreateCmd orderCreateCmd);
}
