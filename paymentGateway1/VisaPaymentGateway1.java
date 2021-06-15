package com.online.payment.paymentGateway1;

import com.online.payment.EPaymentMethod1;
import com.online.payment.model1.IPaymentDetails1;
import com.online.payment.processor1.IPaymentProcessor1;
import com.online.payment.processor1.VisaPaymentProcessor1;


public class VisaPaymentGateway1 implements IPaymentGateway1{

    @Override
    public IPaymentGateway1 withPaymentMethod(EPaymentMethod1 ePaymentMethod1) {

        System.out.println("VisaPaymentGateway selected");
        return this;
    }

    @Override
    public IPaymentProcessor1 withPaymentDetails(IPaymentDetails1 iPaymentDetails1) {

        return new VisaPaymentProcessor1();
    }
}
