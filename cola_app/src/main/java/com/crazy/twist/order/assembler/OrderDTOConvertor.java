package com.crazy.twist.order.assembler;

import com.crazy.twist.dto.data.OrderDTO;
import com.crazy.twist.order.model.aggregates.OrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @ClassName OrderDTOConvertor
 * @Author mengke
 * @create 2022/5/13 01:14
 * @Description 简单的数据转换可以使用
 */
@Mapper
public interface OrderDTOConvertor {

    OrderDTOConvertor INSTANCE = Mappers.getMapper(OrderDTOConvertor.class);

    OrderEntity toDomainObject(OrderDTO orderDTO);
}
