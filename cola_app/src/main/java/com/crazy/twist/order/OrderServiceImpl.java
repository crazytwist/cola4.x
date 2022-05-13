package com.crazy.twist.order;

import com.alibaba.cola.catchlog.CatchAndLog;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.crazy.twist.api.OrderServiceI;
import com.crazy.twist.dto.cmd.OrderCreateCmd;
import com.crazy.twist.dto.data.OrderDTO;
import com.crazy.twist.dto.qry.OrderPreviewQry;
import com.crazy.twist.order.executor.OrderCreateCmdExe;
import com.crazy.twist.order.executor.OrderPreviewQryExe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName OrderServiceImpl
 * @Author mengke
 * @create 2022/5/6 16:10
 * @Description
 */
@Service
@CatchAndLog
public class OrderServiceImpl implements OrderServiceI {

    @Autowired
    private OrderCreateCmdExe orderCreateCmdExe;

    @Autowired
    private OrderPreviewQryExe orderPreviewQryExe;

    @Override
    public SingleResponse<OrderDTO> previewOrder(OrderPreviewQry orderPreviewQry) {
        return orderPreviewQryExe.execute(orderPreviewQry);
    }

    @Override
    public Response createOrder(OrderCreateCmd orderCreateCmd) {
        orderCreateCmdExe.execute(orderCreateCmd);
        return Response.buildSuccess();
    }
}
