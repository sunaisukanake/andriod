package com.example.sunais.andriodprojwithnuboat;

public class ExchangeRate {

    public double exchange(final double amount, final String currency) {

        if ("USD".equals(currency)) {
            return amount/30;
        } else if ("YEN".equals(currency)) {
            return amount/15;

        }

        throw new IllegalArgumentException("Currency Not Support!");

    }

}
