package com.online.payment.model1;

public class VisaPaymentDetails1 implements IPaymentDetails1{

    String fromCardNo1,toAccountNo1,expirationDate1,cvv1;

    public String getFromCardNo1() {
        return fromCardNo1;
    }

    public void setFromCardNo1(String fromCardNo1) {
        this.fromCardNo1 = fromCardNo1;
    }

    public String getToAccountNo1() {
        return toAccountNo1;
    }

    public void setToAccountNo1(String toAccountNo1) {
        this.toAccountNo1 = toAccountNo1;
    }

    public String getExpirationDate1() {
        return expirationDate1;
    }

    public void setExpirationDate1(String expirationDate1) {
        this.expirationDate1 = expirationDate1;
    }

    public String getCvv1() {
        return cvv1;
    }

    public void setCvv1(String cvv1) {
        this.cvv1 = cvv1;
    }

    @Override
    public String toString() {
        return "VisaPaymentDetails1{" +
                "fromCardNo1='" + fromCardNo1 + '\'' +
                ", toAccountNo1='" + toAccountNo1 + '\'' +
                ", expirationDate1='" + expirationDate1 + '\'' +
                ", cvv1='" + cvv1 + '\'' +
                '}';
    }

    public VisaPaymentDetails1(String fromCardNo1, String toAccountNo1, String expirationDate1, String cvv1){


        this.fromCardNo1 = fromCardNo1;
        this.toAccountNo1 = toAccountNo1;
        this.expirationDate1 = expirationDate1;
        this.cvv1 = cvv1;
    }
}
