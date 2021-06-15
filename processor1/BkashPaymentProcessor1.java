package com.online.payment.processor1;

import com.online.payment.model1.IPaymentDetails1;

public class BkashPaymentProcessor1 implements IPaymentProcessor1{

    private final IPaymentDetails1 paymentDetails1;

    public BkashPaymentProcessor1(IPaymentDetails1 paymentDetails1) {

        this.paymentDetails1 = paymentDetails1;
    }

    @Override
    public void process1() {
        System.out.println("Bkash payment successful");
        System.out.println(paymentDetails1.toString());

    }
}
