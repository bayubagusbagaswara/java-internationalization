package com.project;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {

    @Test
    void testNumberFormat() {
        // pada number format tidak memerlukan pattern
        var numberFormat = NumberFormat.getInstance();

        // masukkan format nya apa, ada long, double
        var format = numberFormat.format(10000000.255);
        System.out.println(format);
    }

    @Test
    void testNumberFormatIndonesia() {
        // kalau mau menggunakan I18N cukup menambahkan Locale pada parameter getInstance
        // otomatis numberformat akan menyesuaikan locale nya
        var indonesia = new Locale("in", "ID");
        var numberFormat = NumberFormat.getInstance(indonesia);
        var format = numberFormat.format(10000000.255);
        System.out.println(format);
    }


    @Test
    void testNumberFormatParseIndonesia() {

        // mau parsing string input menjadi data number biasa
        var indonesia = new Locale("in", "ID");
        var numberFormat = NumberFormat.getInstance(indonesia);

        try {
            // formatnya harus Indonesia dan harus try-catch
            // dan ubah menjadi tipe data number apa double atau long
            var result = numberFormat.parse("10.000.000,255").doubleValue();
            System.out.println(result);
        } catch (ParseException e) {
            System.out.println("Error parse: " + e.getMessage());
        }
    }
}
