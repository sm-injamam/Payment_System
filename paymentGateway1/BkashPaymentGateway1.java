package com.online.payment.paymentGateway1;

import com.online.payment.EPaymentMethod1;
import com.online.payment.model1.IPaymentDetails1;
import com.online.payment.processor1.BkashPaymentProcessor1;
import com.online.payment.processor1.IPaymentProcessor1;

public class BkashPaymentGateway1  implements IPaymentGateway1{

    @Override
    public IPaymentGateway1 withPaymentMethod(EPaymentMethod1 ePaymentMethod1) {
        System.out.println("BkashPaymentGateway selected");
        return this;
    }

    @Override
    public IPaymentProcessor1 withPaymentDetails(IPaymentDetails1 iPaymentDetails1) {
        return new BkashPaymentProcessor1(iPaymentDetails1);
    }
}
