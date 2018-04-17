package com.geforce.order.repository;

import com.geforce.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author geforce
 * @date 2018/4/16
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {

}
