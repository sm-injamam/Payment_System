package com.online.payment;

import com.online.payment.model1.BkashPaymentDetails1;
import com.online.payment.model1.IPaymentDetails1;
import com.online.payment.model1.VisaPaymentDetails1;


import java.util.Scanner;

public class Apllication1 extends AbstractPaymentProcessor1 {


    @Override
    void run1() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please select payment method; ");
        System.out.println("1 = Bkash");
        System.out.println("2 = Master Card");
        System.out.println("3 = Visa");
        System.out.println("4 = AMEX");
        System.out.println("5 = Paypal");
        int i = sc.nextInt();

        IPaymentDetails1 paymentDetails1 = null;

        switch (i){
            case 1:
                System.out.println("Enter from mobile number");
                String fromMobileNo1 = sc.next();
                System.out.println("Enter to mobile number");
                String toMobileNo1 = sc.next();
                System.out.println("Enter your pin");
                String pin1 = sc.next();

                paymentDetails1 = new BkashPaymentDetails1(fromMobileNo1,toMobileNo1,pin1);
                break;
            default:
                System.out.println("Enter fromCardNo ");
                String fromCardNo1 = sc.next();
                System.out.println("Enter fromAccountNo1 ");
                String toAccountNo1 = sc.next();
                System.out.println("Enter expirationDate1 ");
                String expirationDate1 = sc.next();
                System.out.println("Enter cvv1 ");
                String cvv1 = sc.next();
                paymentDetails1 = new VisaPaymentDetails1(fromCardNo1,toAccountNo1,expirationDate1,cvv1);

        }

        super.setPaymentDetails1(paymentDetails1);
        super.process1(i);

    }

    public static void main(String[] args) {
        Apllication1 apllication1 = new Apllication1();
        apllication1.run1();

    }
}
