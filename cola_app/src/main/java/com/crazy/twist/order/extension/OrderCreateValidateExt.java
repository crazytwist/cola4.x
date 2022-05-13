package com.crazy.twist.order.extension;

import com.alibaba.cola.extension.Extension;
import com.crazy.twist.dto.cmd.OrderCreateCmd;
import com.crazy.twist.order.constant.Constants;
import com.crazy.twist.order.extensionpoint.OrderCreateValidateExtPt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @ClassName OrderCreateValidateExt
 * @Author mengke
 * @create 2022/5/11 22:48
 * @Description
 */
@Extension(bizId = Constants.BIZ_TOB, useCase = Constants.USE_CASE_ZD_PORK, scenario = Constants.ORDER_CREATE)
public class OrderCreateValidateExt implements OrderCreateValidateExtPt {

    Logger logger = LoggerFactory.getLogger(OrderCreateValidateExt.class);

    @Override
    public void validate(OrderCreateCmd orderCreateCmd) {
        logger.info("02 [数据校验]  : 订单创建");
    }
}
