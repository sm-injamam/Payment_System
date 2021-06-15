package com.online.payment;

import java.util.stream.Stream;

public enum EPaymentMethod1 {
    BKASH1(1),
    MASTER_CARD1(2),
    VISA1(3),
    AMEX1(4),
    PAYPAL1(5);

    int paymentMethodType1;

    EPaymentMethod1(int i){
        this.paymentMethodType1 = i;

    }

    static public EPaymentMethod1 getValue(int i){
        return Stream.of(EPaymentMethod1.values()).filter(x->x.paymentMethodType1 == i).findFirst().get();
    }
}
