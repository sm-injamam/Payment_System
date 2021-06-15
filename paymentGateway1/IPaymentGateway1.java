package com.online.payment.paymentGateway1;

import com.online.payment.EPaymentMethod1;
import com.online.payment.model1.IPaymentDetails1;
import com.online.payment.processor1.IPaymentProcessor1;

public interface IPaymentGateway1 {
    IPaymentGateway1 withPaymentMethod(EPaymentMethod1 ePaymentMethod1);

    IPaymentProcessor1 withPaymentDetails(IPaymentDetails1 iPaymentDetails1);
}
