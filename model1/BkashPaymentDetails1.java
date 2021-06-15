package com.online.payment.model1;

public class BkashPaymentDetails1  implements IPaymentDetails1{
    String fromMobileNo1,toMobileNo1,pin1;

    public String getFromMobileNo1() {
        return fromMobileNo1;
    }

    public void setFromMobileNo1(String fromMobileNo1) {
        this.fromMobileNo1 = fromMobileNo1;
    }

    public String getToMobileNo1() {
        return toMobileNo1;
    }

    public void setToMobileNo1(String toMobileNo1) {
        this.toMobileNo1 = toMobileNo1;
    }

    public String getPin() {
        return pin1;
    }

    public void setPin(String pin) {
        this.pin1 = pin;
    }

    @Override
    public String toString() {
        return "BkashPaymentDetails1{" +
                "fromMobileNo1='" + fromMobileNo1 + '\'' +
                ", toMobileNo1='" + toMobileNo1 + '\'' +
                ", pin='" + pin1 + '\'' +
                '}';
    }

    public BkashPaymentDetails1(String fromMobileNo1, String toMobileNo1, String pin1){
        this.fromMobileNo1 = fromMobileNo1;
        this.toMobileNo1 = toMobileNo1;
        this.pin1 = pin1;

    }


}
