package com.crazy.twist.order.model.aggregates;

import com.alibaba.cola.domain.Entity;
import com.alibaba.cola.dto.SingleResponse;
import com.crazy.twist.dto.data.OrderDTO;
import com.crazy.twist.order.model.entities.*;
import com.crazy.twist.order.model.valueobjects.OrderStatus;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @ClassName OrderEntity
 * @Author mengke
 * @create 2022/5/6 23:33
 * @Description 订单域对象 订单域 充血模型
 */
@Data
@Builder
@Entity
public class OrderEntity implements Serializable {

    private static final long serialVersionUID = 7945788803214727244L;

    private String orderId;

    private Date createdAt;

    private OrderStatus orderStatus;

    private OrderHeader orderHeader;

    private OrderDelivery orderDelivery;

    private OrderHeaderExtension orderHeaderExtension;

    private List<OrderItem> orderItems;

    private List<OrderPayment> orderPayments;

    public SingleResponse<OrderDTO> previewOrder() {
        return SingleResponse.of(new OrderDTO());
    }
}
