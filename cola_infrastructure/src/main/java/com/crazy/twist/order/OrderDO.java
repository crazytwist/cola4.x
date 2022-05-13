package com.crazy.twist.order;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName OrderDO
 * @Author mengke
 * @create 2022/5/7 01:15
 * @Description
 */
public class OrderDO implements Serializable {

    private static final long serialVersionUID = -6521229586700704677L;

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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getOrderAt() {
        return orderAt;
    }

    public void setOrderAt(Date orderAt) {
        this.orderAt = orderAt;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getSaleMode() {
        return saleMode;
    }

    public void setSaleMode(String saleMode) {
        this.saleMode = saleMode;
    }
}
