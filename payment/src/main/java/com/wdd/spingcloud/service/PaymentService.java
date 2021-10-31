package com.wdd.spingcloud.service;

import com.wdd.springcloud.entites.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author: wz
 * @date: 2021/9/29
 * @description:
 */
public interface PaymentService {
     Integer create(Payment payment);

     Payment getPaymentById(@Param("id") Long id);

}
