package com.online.payment.paymentGateway1;

import com.online.payment.EPaymentMethod1;
import com.online.payment.model1.IPaymentDetails1;
import com.online.payment.processor1.IPaymentProcessor1;

public class PaymentGateway1 implements IPaymentGateway1 {

    IPaymentGateway1 currentPaymentGateway1;

    @Override
    public IPaymentGateway1 withPaymentMethod(EPaymentMethod1 ePaymentMethod1) {

        switch (ePaymentMethod1){
            case BKASH1:
                currentPaymentGateway1 = new BkashPaymentGateway1();
                return currentPaymentGateway1;

            case VISA1:
                return currentPaymentGateway1 = new VisaPaymentGateway1();

            default:
                throw new RuntimeException("Invalid payment Gateway");
        }
    }

    @Override
    public IPaymentProcessor1 withPaymentDetails(IPaymentDetails1 iPaymentDetails1) {

        if (currentPaymentGateway1 != null){
            return this.currentPaymentGateway1.withPaymentDetails(iPaymentDetails1);
        }
        else
            throw new RuntimeException("Invalid payment Details");

    }
}
