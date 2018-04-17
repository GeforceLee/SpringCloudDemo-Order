package com.geforce.order.dto;

import com.geforce.order.dataobject.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author geforce
 * @date 2018/4/16
 */
@Data
public class OrderDTO {

    private String orderId;

    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private String buyerOpenid;
    private BigDecimal orderAmount;
    private Integer orderStatus;
    private Integer payStatus;
    private Date createTime;
    private Date updateTime;


    private List<OrderDetail> orderDetailList;

}
