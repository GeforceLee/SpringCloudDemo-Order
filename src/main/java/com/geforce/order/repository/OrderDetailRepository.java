package com.geforce.order.repository;

import com.geforce.order.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author geforce
 * @date 2018/4/16
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {


}
