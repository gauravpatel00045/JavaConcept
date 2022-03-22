package com.payment;

public class VisaCard extends OnlinePayment{

    @Override
    protected boolean validatePayment(Object paymentInfo) {
        if(super.validatePayment(paymentInfo)){
            // balance Check
            return true;
        }
        return false;
    }

    @Override
    public boolean doPayment(Object paymentInfo) {
        if(!validatePayment(paymentInfo)) return false;
        System.out.println("Payment successful with Visa Card");
        return true;
    }
}
