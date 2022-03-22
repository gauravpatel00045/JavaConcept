package com.payment;

public  abstract class OnlinePayment implements Payment{
    protected boolean validatePayment(Object paymentInfo){
        //CCV
        //CARD NUMBER
        //EXPIRE DATE
        return true;
    }

}
