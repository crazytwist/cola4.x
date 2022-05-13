package com.crazy.twist.order.executor;

import com.alibaba.cola.extension.ExtensionExecutor;
import com.crazy.twist.dto.cmd.OrderCreateCmd;
import com.crazy.twist.order.domainservice.OrderDomainService;
import com.crazy.twist.order.extensionpoint.OrderCreateConvertorExtPt;
import com.crazy.twist.order.model.aggregates.OrderEntity;
import com.crazy.twist.order.extensionpoint.OrderCreateValidateExtPt;
import com.crazy.twist.order.extensionpoint.OrderPreviewConvertorExtPt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @ClassName OrderCreateCmdExe
 * @Author mengke
 * @create 2022/5/6 16:45
 * @Description
 */
@Component
public class OrderCreateCmdExe {

    private Logger logger = LoggerFactory.getLogger(OrderCreateCmdExe.class);

    @Resource
    private ExtensionExecutor extensionExecutor;

    @Resource
    private OrderDomainService orderDomainService;

    public void execute(OrderCreateCmd orderCreateCmd) {

        logger.info("01 Start processing command:" + orderCreateCmd);

        extensionExecutor.executeVoid(OrderCreateValidateExtPt.class, orderCreateCmd.getBizScenario(), extension -> extension.validate(orderCreateCmd));

        logger.info("03 Call Domain Entity for business logic processing..." + orderCreateCmd);

        OrderEntity orderEntity = extensionExecutor.execute(OrderCreateConvertorExtPt.class, orderCreateCmd.getBizScenario(), extension -> extension.toDomainObject(orderCreateCmd.getOrderDTO()));

        orderDomainService.createOrderEntity(orderEntity);

    }
}
