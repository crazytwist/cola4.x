package com.crazy.twist.api;

import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.crazy.twist.dto.cmd.OrderCreateCmd;
import com.crazy.twist.dto.data.OrderDTO;
import com.crazy.twist.dto.qry.OrderPreviewQry;

/**
 * @ClassName OrderServiceI
 * @Author mengke
 * @create 2022/5/6 15:54
 * @Description 订单域给外部使用的接口
 */
public interface OrderServiceI {

    /**
     * 预览订单
     *
     * @param orderPreviewQry 预览查询命令
     * @return OrderDTO
     */
    public SingleResponse<OrderDTO> previewOrder(OrderPreviewQry orderPreviewQry);

    /**
     * 创建订单
     *
     * @param orderCreateCmd 创建订单命令
     * @return Response
     */
    public Response createOrder(OrderCreateCmd orderCreateCmd);

}
