package com.payment;

public class MasterCard extends OnlinePayment{
    @Override
    public boolean doPayment(Object paymentInfo) {
        if(!validatePayment(paymentInfo)) return false;
        System.out.println("Payment successful with Mastercard");
        return true;
    }
}
