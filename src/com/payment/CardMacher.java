package com.payment;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class CardMacher {
   private static Map<String, Payment> matcher = new HashMap<>();

   private static void initMatcher(){
        matcher.put(CardPettern.PATTERN_VISA_CARD.getPattern(), new VisaCard());
        matcher.put(CardPettern.PATTERN_MASTER_CARD.getPattern(), new MasterCard());
    }

    public static Payment getCard(String cardNumber){
        if(matcher.isEmpty()) initMatcher();
        for(Map.Entry<String,Payment> entry : matcher.entrySet()){
            if(Pattern.matches(entry.getKey(), cardNumber)){
                return matcher.get(entry.getKey());
            }
        }
        throw new RuntimeException("Invalid card number");
    }
}
