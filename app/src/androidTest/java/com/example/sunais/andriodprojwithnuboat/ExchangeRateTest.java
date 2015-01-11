package com.example.sunais.andriodprojwithnuboat;



import android.test.InstrumentationTestCase;


public class ExchangeRateTest extends InstrumentationTestCase {

    final ExchangeRate exchangeRate = new ExchangeRate();

    public void testExchangeToUSD() throws Exception {

        final double amount = 300;
        final String currency = "USD";
        final double expected = 10;

        final  double result = exchangeRate.exchange(amount,currency);
        assertEquals(expected,result);

    }

    public void testExchangeToYEN() throws Exception {

        final double amount = 300;
        final String currency = "YEN";
        final double expected = 20;

        final  double result = exchangeRate.exchange(amount,currency);
        assertEquals(expected,result);

    }

}