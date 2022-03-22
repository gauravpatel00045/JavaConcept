package com.payment;

public enum CardPettern {
    PATTERN_VISA_CARD("^4[0-9]{6,19}$"),
    PATTERN_MASTER_CARD ("^5[1-5][0-9]{5,}$");

    String pattern;

    CardPettern(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }
}
