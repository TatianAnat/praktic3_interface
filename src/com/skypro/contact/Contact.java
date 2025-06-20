package com.skypro.contact;

public interface Contact {

    void call();

    default  void sound() {
        System.out.println("...");
        call();
    }
}
