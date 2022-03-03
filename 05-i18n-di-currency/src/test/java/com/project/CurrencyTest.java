package com.project;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class CurrencyTest {
    @Test
    void testCurrencyIndonesia() {
        var indonesia = new Locale("in","ID");
        var currency = Currency.getInstance(indonesia);

        // coba tampilkan data currency
        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());

        // ini harus memasukkan locale
        System.out.println(currency.getSymbol(indonesia));
    }

    @Test
    void testCurrencyUSA() {
        var amerika = new Locale("an","US");
        var currency = Currency.getInstance(amerika);

        // coba tampilkan data currency
        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());

        // ini harus memasukkan locale
        System.out.println(currency.getSymbol(amerika));
    }

    @Test
    void testNumberFormatCurrencyIndonesia() {
        var indonesia = new Locale("in","ID");
        var numberFormat = NumberFormat.getCurrencyInstance(indonesia);

        // formatnya seperti apa
        var format = numberFormat.format(1000000);
        var format1 = numberFormat.format(1000000.3456);

        System.out.println(format);
        System.out.println(format1);
    }

    @Test
    void testNumberFormatCurrencyParseIndonesia() {
        // parsing dari mata uang ke number biasa
        var indonesia = new Locale("in","ID");

        // pake getCurrencyInstance
        var numberFormat = NumberFormat.getCurrencyInstance(indonesia);

        try {
            var parse = numberFormat.parse("Rp983.000,25").doubleValue();
            System.out.println(parse);
        } catch (ParseException e) {
            System.out.println("Error parse: " + e.getMessage());
        }
    }
}
