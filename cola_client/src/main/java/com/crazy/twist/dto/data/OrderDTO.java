package com.crazy.twist.dto.data;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName OrderDTO
 * @Author mengke
 * @create 2022/5/6 15:56
 * @Description 订单传出对象
 */
@Data
public class OrderDTO implements Serializable {

    private static final long serialVersionUID = 6812984929337720805L;

    /**
     * 订单号
     */
    private String orderId;

    /**
     * 订单时间
     */
    private Date orderAt;

    /**
     * 订单金额
     */
    private BigDecimal orderAmount;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 销售渠道
     */
    private String channel;

    /**
     * 订单类型
     */
    private String orderType;

    /**
     * 销售模式
     */
    private String saleMode;
}
