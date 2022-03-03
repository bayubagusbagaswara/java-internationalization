package com.project;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTest {

    @Test
    void testMessageFormat() {
        // bikin pattern nya dulu
        String pattern = "Hi {0}, Anda bisa mencari data Anda dengan mengetikan \"{0}\" di pencarian";

        // bikin object messageFormat nya, dan masukkan pattern nya
        var messageFormat = new MessageFormat(pattern);

        // melakukan format berupa array dan masukkan data untuk parameter di Object nya
        var format = messageFormat.format(new Object[]{
                // masukkan data untuk parameternya, jika parameter hanya satu maka masukkan satu data saja
                "Bayu"
        });
        System.out.println(format);
    }


    @Test
    void testMessageFormatResourceBundleIndonesia() {
        // kombinasikan recourcebundle dengan message format agar bisa digunakan I18N
        var locale = new Locale("in", "ID");
        var resourceBundle = ResourceBundle.getBundle("message", locale);

        // tentukan file pattern nya
        var pattern = resourceBundle.getString("welcome.message");

        var messageFormat = new MessageFormat(pattern);
        var format = messageFormat.format(new Object[]{
                // masukkan data untuk parameternya
                "Bayu", "Programmer Zaman Now"
        });
        System.out.println(format);
    }

    @Test
    void testMessageFormatResourceBundleAmerika() {
        var locale = new Locale("an", "US");
        var resourceBundle = ResourceBundle.getBundle("message", locale);

        // tentukan file pattern nya
        var pattern = resourceBundle.getString("welcome.message");

        var messageFormat = new MessageFormat(pattern);
        var format = messageFormat.format(new Object[]{
                // masukkan data untuk parameternya
                "Bayu", "Programmer Zaman Now"
        });
        System.out.println(format);
    }
}
