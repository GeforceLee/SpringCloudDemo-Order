package com.geforce.order.service;

import com.geforce.order.dto.OrderDTO;

/**
 * @author geforce
 * @date 2018/4/16
 */
public interface OrderService {

    OrderDTO create(OrderDTO orderDTO);
}
