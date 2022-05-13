package com.crazy.twist.dto.qry;

import com.alibaba.cola.dto.Query;
import com.alibaba.cola.extension.BizScenario;
import com.crazy.twist.dto.data.OrderDTO;
import lombok.Builder;
import lombok.Data;

/**
 * @ClassName OrderPreviewQry
 * @Author mengke
 * @create 2022/5/6 16:04
 * @Description 预览订单命令
 */
@Data
@Builder
public class OrderPreviewQry extends Query {

    private static final long serialVersionUID = 575187802741310454L;

    private OrderDTO orderDTO;

    private String biz;

    private BizScenario bizScenario;
}
