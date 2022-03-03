package com.project;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {

    @Test
    void testResourceBundle() {
        // kita ambil data dari resourcebundle yang sudah kita buat file nya
        // masukan nama file properties
        var resourceBundle = ResourceBundle.getBundle("message");

        // untuk ambil datanya cukup tulis Key nya
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void testResourceBundleIndonesia() {
        // kita ingin maksa berubah resource bundle tidak menggunakan english, tapi berganti indonesia

        // create object Locale
        var indonesia = new Locale("in", "ID");
        // saat getBundle, maka kita masukkan locale nya
        var resourceBundle = ResourceBundle.getBundle("message", indonesia);

        // hasilnya ini akan membundle file message_id_ID
        // karena sudah dipaksa menjadi Indonesia
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void testResourceBundleNotFound() {
        // jika ResourceBundle tidak menemukan file properties yang sesuai
        // maka secara default akan menggunakan file message.properties
        var indonesia = new Locale("en", "US");
        var resourceBundle = ResourceBundle.getBundle("message", indonesia);

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void testResourceBundleMultipleTimes() {
        var indonesia = new Locale("en", "US");
        var resourceBundle1 = ResourceBundle.getBundle("message", indonesia);
        var resourceBundle2 = ResourceBundle.getBundle("message", indonesia);

        // kalau kita ResourceBundle dengan data yang sama, maka tidak akan mengulang bundlenya
        // karena disimpan dalam sistem Caching
        System.out.println(resourceBundle1.equals(resourceBundle2)); // jadi resourceBundle1 dan resourceBundle2 itu sama
    }
}
