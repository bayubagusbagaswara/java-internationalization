package com.project;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class LocaleTest {

    @Test
    void testNewLocale() {
        var language = "id";
        var country = "ID";

        // create object Locale, masukkan data language dan country
        var locale = new Locale(language, country);

        System.out.println(locale.getLanguage()); // in, karena id itu adalah identitas yang baru, yang lama adalah in
        System.out.println(locale.getCountry());

        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());
    }
}
