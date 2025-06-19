package com.skypro;

import com.skypro.contact.EmailContact;
import com.skypro.contact.MobileContact;

public class JavaProfMain {

    public static void main(String[] args) {
        System.out.println("Skypro Uni - Java Profession start!");

        interfaces();
    }

    private static void interfaces() {
        System.out.println("JavaProfMain.interfaces");

        EmailContact emailContact = new EmailContact("ivan123","yandex.ru");
        MobileContact mobileContact = new MobileContact("7","999","1234567");

        emailContact.call();
        mobileContact.call();
    }
}