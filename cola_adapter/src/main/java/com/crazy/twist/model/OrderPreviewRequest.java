package com.crazy.twist.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName OrderPreviewRequest
 * @Author mengke
 * @create 2022/5/11 22:27
 * @Description
 */
@Data
public class OrderPreviewRequest implements Serializable {

    private static final long serialVersionUID = -8139614679508590081L;

    private String orderId;

}
