package com.crazy.twist.order.executor;

import com.alibaba.cola.dto.SingleResponse;
import com.alibaba.cola.extension.ExtensionExecutor;
import com.crazy.twist.dto.data.OrderDTO;
import com.crazy.twist.dto.qry.OrderPreviewQry;
import com.crazy.twist.order.model.aggregates.OrderEntity;
import com.crazy.twist.order.extensionpoint.OrderPreviewConvertorExtPt;
import com.crazy.twist.order.extensionpoint.OrderPreviewValidateExtPt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @ClassName OrderPreviewQryExe
 * @Author mengke
 * @create 2022/5/6 16:55
 * @Description
 */
@Component
public class OrderPreviewQryExe {

    private Logger logger = LoggerFactory.getLogger(OrderPreviewQry.class);

    @Resource
    private ExtensionExecutor extensionExecutor;

    public SingleResponse<OrderDTO> execute(OrderPreviewQry orderPreviewQry) {

        logger.info("01 Start processing command:" + orderPreviewQry);

        extensionExecutor.executeVoid(OrderPreviewValidateExtPt.class, orderPreviewQry.getBizScenario(), extension -> extension.validate(orderPreviewQry));

        OrderEntity orderEntity = extensionExecutor.execute(OrderPreviewConvertorExtPt.class, orderPreviewQry.getBizScenario(), extension -> extension.clientToEntity(orderPreviewQry));

        logger.info("04 Call Domain Entity for business logic processing..."+orderEntity);

        return orderEntity.previewOrder();
    }
}
