package com.skypro;

import com.skypro.contact.Contact;
import com.skypro.contact.EmailContact;
import com.skypro.contact.MobileContact;
import com.skypro.person.Dog;
import com.skypro.person.Friend;
import com.skypro.person.Person;
import com.skypro.person.Work;

public class JavaProfMain {

    public static void main(String[] args) {
        System.out.println("Skypro Uni - Java Profession start!");

        polymorphism();
        interfaces();

    }

    private static void polymorphism() {
        System.out.println("JavaProfMain.polymorphism");
        EmailContact emailContact = new EmailContact("ivan123","yandex.ru");
        MobileContact mobileContact = new MobileContact("7","999","1234567");
        //зададим объект класса Person
        Person ivan = new Person("Ivan");
        ivan.setContact(emailContact);
        //вызывем метод messange
        ivan.message("Привет");
        //затем установим ему другой контакт - мобильный
        ivan.setContact(mobileContact);
        ivan.message("Встречаемся в 19:00!");
    }

    private static void interfaces() {
        System.out.println("JavaProfMain.interfaces");

        EmailContact emailContact = new EmailContact("ivan123","yandex.ru");
        MobileContact mobileContact = new MobileContact("7","999","1234567");

        emailContact.call();
        mobileContact.call();
        emailContact.sound();
        mobileContact.sound();
        ((Contact)mobileContact).sound();

        emailContact.exit();
        mobileContact.exit();
        specificRealizationCommonInterface();
    }

    private static void specificRealizationCommonInterface(){
        System.out.println("JavaProfMain.specificRealizationCommonInterface");

        EmailContact emailContact = new EmailContact("ivan123","yandex.ru");
        MobileContact mobileContact = new MobileContact("7","999","1234567");

        Person ivan = new Person("ivan");
        ivan.setContact(emailContact);
        Person petr = new Person("petr");
        petr.setContact(mobileContact);

        //объявляем массив людей
        Person[] people = {ivan, petr};
        //передаём массив и сообщение
        sendMessage(people, "Встречаемся в кафе!");

        System.out.println("Понедельник");

        workGroup(people);

    }

    //метод отправки сообщений группе людей
    //Принимает массив друзей и сообщение
    private static void sendMessage(Friend[] friends, String message){
        for (Friend friend: friends){
            //обращаемся к каждому
            System.out.println("Эй!");
            //отправляем сообщение
            friend.message(message);
        }

    }

    private static void workGroup(Work[] workers) {
        for (Work worker: workers) {
            worker.work();
        }
    }
}