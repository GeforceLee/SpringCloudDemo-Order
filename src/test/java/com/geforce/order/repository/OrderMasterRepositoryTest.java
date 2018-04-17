package com.geforce.order.repository;

import com.geforce.order.OrderApplicationTests;
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
public class OrderMasterRepositoryTest extends OrderApplicationTests {
    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Test
    public void testSave(){
        OrderMaster orderMaster = new OrderMaster();

        orderMaster.setOrderId("123132123");
        orderMaster.setBuyerAddress("北京");
        orderMaster.setBuyerName("xiaochuan");
        orderMaster.setBuyerOpenid("11111");
        orderMaster.setBuyerPhone("185");
        orderMaster.setOrderAmount(new BigDecimal("11.01"));
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        OrderMaster result = orderMasterRepository.save(orderMaster);
        Assert.assertNotNull(result);
    }

}