package com.project;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTypeTest {

    @Test
    void testMessageFormatTypeIndonesia() {
        var locale = new Locale("in", "ID");
        var resourceBundle = ResourceBundle.getBundle("message", locale);

        var pattern = resourceBundle.getString("status");

        // kita bisa menambahkan locale pada parameter messageformat
        // dengan begitu messageformat bisa menyesuaikan dengan format di locale
        var messageFormat = new MessageFormat(pattern, locale);
        var format = messageFormat.format(new Object[]{
                "Bayu", new Date(), 1000000
        });
        System.out.println(format);
    }

    @Test
    void testMessageFormatTypeAmerika() {
        var locale = new Locale("an", "US");
        var resourceBundle = ResourceBundle.getBundle("message", locale);

        var pattern = resourceBundle.getString("status");

        // ini akan pake currency Dollar
        var messageFormat = new MessageFormat(pattern, locale);
        var format = messageFormat.format(new Object[]{
                "Bayu", new Date(), 1000000
        });
        System.out.println(format);
    }
}
