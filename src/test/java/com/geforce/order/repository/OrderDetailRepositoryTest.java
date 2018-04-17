package com.geforce.order.repository;

import com.geforce.order.OrderApplicationTests;
import com.geforce.order.dataobject.OrderDetail;
import com.geforce.order.dataobject.OrderMaster;
import com.geforce.order.enums.OrderStatusEnum;
import com.geforce.order.enums.PayStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @author geforce
 * @date 2018/4/16
 */
public class OrderDetailRepositoryTest extends OrderApplicationTests {
    @Autowired
    private OrderDetailRepository orderDetailRepository;


    @Test
    public void testSave() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("111");
        orderDetail.setOrderId("11111");
        orderDetail.setProductId("157875196366160022");
        orderDetail.setProductName("皮蛋瘦肉粥");
        orderDetail.setProductPrice(new BigDecimal("10.01"));
        orderDetail.setProductQuantity(1);
        orderDetail.setProductIcon("adfasf");

        orderDetailRepository.save(orderDetail);
    }

}