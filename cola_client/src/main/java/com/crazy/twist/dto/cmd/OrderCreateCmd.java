package com.crazy.twist.dto.cmd;

import com.alibaba.cola.dto.Command;
import com.alibaba.cola.extension.BizScenario;
import com.crazy.twist.dto.data.OrderDTO;
import lombok.Builder;
import lombok.Data;

/**
 * @ClassName OrderCreateCmd
 * @Author mengke
 * @create 2022/5/6 16:06
 * @Description 执行命令
 */
@Data
@Builder
public class OrderCreateCmd extends Command {

    private static final long serialVersionUID = -2291397290192881575L;

    private OrderDTO orderDTO;

    private String biz;

    private BizScenario bizScenario;
}
