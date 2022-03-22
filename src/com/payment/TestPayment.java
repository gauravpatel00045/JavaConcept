package com.payment;

public class TestPayment {
    public static void main(String[] args) {
        String cardNumber = "5459640057236281";
        CardMacher.getCard(cardNumber).doPayment(null);
    }
}
