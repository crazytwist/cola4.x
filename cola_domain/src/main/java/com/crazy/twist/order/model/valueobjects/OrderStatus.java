package com.crazy.twist.order.model.valueobjects;

/**
 * @ClassName OrderStatus
 * @Author mengke
 * @create 2022/5/11 23:57
 * @Description
 */
public enum OrderStatus {

    CREATED("created", "订单创建"),
    IN_PROCESS("in.process", "正在处理"),
    CANCELED("canceled", "已取消"),
    SHIPPING("shipping", "正在配送"),
    COMPLETED("completed", "已完成");

    private String value;
    private String description;

    OrderStatus(String value, String description) {
    }
}
