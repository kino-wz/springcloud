package com.wdd.spingcloud.service.impl;

import com.wdd.spingcloud.dao.PaymentMapper;
import com.wdd.spingcloud.service.PaymentService;
import com.wdd.springcloud.entites.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: wz
 * @date: 2021/9/29
 * @description:
 */
@Slf4j
@Service
public class PaymentServiceImpl implements PaymentService {


    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public Integer create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }

}
