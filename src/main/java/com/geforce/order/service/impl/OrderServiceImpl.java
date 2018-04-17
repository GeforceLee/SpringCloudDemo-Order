package com.geforce.order.service.impl;

import com.geforce.order.dataobject.OrderMaster;
import com.geforce.order.dto.OrderDTO;
import com.geforce.order.enums.OrderStatusEnum;
import com.geforce.order.enums.PayStatusEnum;
import com.geforce.order.repository.OrderDetailRepository;
import com.geforce.order.repository.OrderMasterRepository;
import com.geforce.order.service.OrderService;
import com.geforce.order.utils.KeyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author geforce
 * @date 2018/4/16
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDetailRepository orderDetailRepository;


    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {

        //TODO 查询商品信息(服务)
        //TODO 计算总结
        //TODO 扣库存

        //订单入库
        OrderMaster orderMaster = new OrderMaster();
        orderDTO.setOrderId(KeyUtil.genUniqueKey());
        BeanUtils.copyProperties(orderDTO,orderMaster);
        orderMaster.setOrderAmount(new BigDecimal(10));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());

        orderMasterRepository.save(orderMaster);
        return orderDTO;
    }
}
