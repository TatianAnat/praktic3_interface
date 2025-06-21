package com.skypro.contact;

public class EmailContact implements Contact, Technolodgy {

    private String name;
    private String domain;

    public EmailContact(String name, String domain) {
        this.name = name;
        this.domain = domain;
    }

    @Override
    public void call() {
        System.out.println("Вызов " + name + "@" + domain);
    }

    @Override
    public void exit() {
        System.out.println("EmailContact.exit");
    }
}
