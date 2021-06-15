package com.online.payment;

import com.online.payment.model1.IPaymentDetails1;
import com.online.payment.paymentGateway1.PaymentGateway1;
import com.online.payment.paymentGateway1.IPaymentGateway1;

public abstract class AbstractPaymentProcessor1 {
    IPaymentDetails1 iPaymentDetails1;

    public void setPaymentDetails1(IPaymentDetails1 iPaymentDetails1){

        this.iPaymentDetails1 = iPaymentDetails1;
    }

    protected void process1(int i){
        EPaymentMethod1 ePaymentMethod1 = EPaymentMethod1.getValue(i);
        IPaymentGateway1 paymentGateway1 =new PaymentGateway1(); //IPaymentGateway1
        paymentGateway1.withPaymentMethod(ePaymentMethod1).withPaymentDetails(iPaymentDetails1).process1();
    }

    abstract void run1();
}
