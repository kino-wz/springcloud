package com.wdd.spingcloud.dao;

import com.wdd.springcloud.entites.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: wz
 * @date: 2021/9/29
 * @description:
 */
@Mapper
public interface PaymentMapper {

     Integer create(Payment payment);

     Payment getPaymentById(@Param("id") Long id);

}
