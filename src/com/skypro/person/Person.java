package com.skypro.person;

import com.skypro.contact.Contact;

public class Person implements Friend, Work {
    private String name;
    private Contact contact;

    public Person(String name) {
        this.name = name;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
    //обращение к человеку. Принимать в этот аргумент будем какое сообщение хотим человеку передать
    @Override
    public void message(String message){
        //внутри будем вызывать человека по контакту, который принадлежит этому человеку
        contact.call();
        //затем печатаем это сообщение
        System.out.println(message);
    }

    @Override
    public void work() {
        System.out.println(name + " работает");
    }

    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", contact=" + contact +
                '}';
    }
}
