package com.project;

import org.junit.jupiter.api.Test;

import java.text.ChoiceFormat;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ChoiceFormatTest {
    @Test
    void testChoiceFormat() {
        // ChoiceFormat semacam pilihan untuk format
        // kalay memasukkan numbernya -1 maka dapat formatnya negatif dst
        var pattern = "-1#negatif | 0#kosong | 1#satu | 1<banyak";
        var choiceFormat = new ChoiceFormat(pattern);

        // coba tampilkan hasilnya
        System.out.println(choiceFormat.format(-2)); // negatif
        System.out.println(choiceFormat.format(-1)); // negatif
        System.out.println(choiceFormat.format(0)); // kosong
        System.out.println(choiceFormat.format(1)); // satu
        System.out.println(choiceFormat.format(2)); // banyak
        System.out.println(choiceFormat.format(3)); // banyak
    }

    @Test
    void testChoiceFormatInMessageFormat() {
        var locale = new Locale("in", "ID");
        var resourceBundle = ResourceBundle.getBundle("message", locale);

        // bikin pattern nya
        var pattern = resourceBundle.getString("balance");

        var messageFormat = new MessageFormat(pattern, locale);

        // coba masukan -1
        System.out.println(messageFormat.format(new Object[]{-1000000}));
        System.out.println(messageFormat.format(new Object[]{0}));
        System.out.println(messageFormat.format(new Object[]{1000000}));
    }
    @Test
    void testChoiceFormatInMessageFormatAmerika() {
        var locale = new Locale("an", "US");
        var resourceBundle = ResourceBundle.getBundle("message", locale);

        // bikin pattern nya
        var pattern = resourceBundle.getString("balance");

        var messageFormat = new MessageFormat(pattern, locale);

        // coba masukan -1
        System.out.println(messageFormat.format(new Object[]{-1000000}));
        System.out.println(messageFormat.format(new Object[]{0}));
        System.out.println(messageFormat.format(new Object[]{1000000}));
    }
}
