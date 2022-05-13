package com.crazy.twist.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName OrderCreateRequest
 * @Author mengke
 * @create 2022/5/13 01:02
 * @Description 订单创建实体
 */
@Data
public class OrderCreateRequest implements Serializable {

    private static final long serialVersionUID = 4347031293955979760L;

    private String orderId;
}
