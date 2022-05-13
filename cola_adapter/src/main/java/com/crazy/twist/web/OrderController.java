package com.crazy.twist.web;

import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.alibaba.cola.extension.BizScenario;
import com.crazy.twist.api.OrderServiceI;
import com.crazy.twist.dto.cmd.OrderCreateCmd;
import com.crazy.twist.dto.data.OrderDTO;
import com.crazy.twist.dto.qry.OrderPreviewQry;
import com.crazy.twist.model.OrderCreateRequest;
import com.crazy.twist.order.constant.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OrderController
 * @Author mengke
 * @create 2022/5/7 00:10
 * @Description
 */
@RestController
@RequestMapping("tob/order")
public class OrderController {

    @Autowired
    private OrderServiceI orderServiceI;

    @PostMapping("/fork/preview")
    public SingleResponse<OrderDTO> previewOrder(@RequestBody OrderPreviewQry orderPreviewQry) {
        orderPreviewQry = OrderPreviewQry.builder()
                .bizScenario(BizScenario.valueOf(Constants.BIZ_TOB, Constants.USE_CASE_ZD_PORK, Constants.ORDER_PREVIEW))
                .biz(Constants.BIZ_TOB)
                .build();
        return orderServiceI.previewOrder(orderPreviewQry);
    }

    @PostMapping("/fork/create")
    public Response createOrder(@RequestBody OrderCreateRequest orderCreateRequest) {
        // 接口校验
        // 数据转换 为 cmd 模式
        OrderCreateCmd orderCreateCmd = OrderCreateCmd.builder()
                .orderDTO(new OrderDTO())
                .biz(Constants.BIZ_TOB)
                .bizScenario(BizScenario.valueOf(Constants.BIZ_TOB, Constants.USE_CASE_ZD_PORK, Constants.ORDER_CREATE))
                .build();
        return orderServiceI.createOrder(orderCreateCmd);
    }


}
