package com.project;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

    @Test
    void testDateFormat() {
        var pattern = "EEEE dd MMMM yyyy";
        var dateFormat = new SimpleDateFormat(pattern);

        // ubah tipe data waktu menjadi string
        var format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatIndonesia() {
        var pattern = "EEEE dd MMMM yyyy";
        var indonesia = new Locale("in", "ID");

        // tambahkan locale
        var dateFormat = new SimpleDateFormat(pattern, indonesia);

        // ubah tipe data waktu menjadi string
        var format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatJapan() {
        var pattern = "EEEE dd MMMM yyyy";
        var japan = new Locale("ja", "JP");

        // tambahkan locale
        var dateFormat = new SimpleDateFormat(pattern, japan);

        // ubah tipe data waktu menjadi string
        var format = dateFormat.format(new Date());
        System.out.println(format);
    }

    // Dari String ke Date, menggunakan parsing harus sesuai formatnya, kalau salah maka akan terjadi error
    @Test
    void testDateFormatParseIndonesia() {
        var pattern = "EEEE dd MMMM yyyy";
        var indonesia = new Locale("in", "ID");
        // tambahkan locale
        var dateFormat = new SimpleDateFormat(pattern, indonesia);

        try {
            var date = dateFormat.parse("Selasa 18 Mei 2021");
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("Error parse : " + e.getMessage());
        }
    }

    @Test
    void testDateFormatParseJapan() {
        var pattern = "EEEE dd MMMM yyyy";
        var japan = new Locale("ja", "JP");

        // tambahkan locale
        var dateFormat = new SimpleDateFormat(pattern, japan);
        try {
            var date = dateFormat.parse("火曜日 18 5月 2021");
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("Error parse : " + e.getMessage());
        }
    }
}
