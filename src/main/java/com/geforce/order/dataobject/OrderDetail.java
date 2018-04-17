package com.geforce.order.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author geforce
 * @date 2018/4/16
 */
@Data
@Entity
public class OrderDetail {

    @Id
    private String detailId;


    private String orderId;


    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private Integer productQuantity;
    private String productIcon;
    private Date createTime;
    private Date updateTime;
}
