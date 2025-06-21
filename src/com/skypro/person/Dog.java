package com.skypro.person;

//Реализует интерфейс Friend и переопределяет метод message
public class Dog implements Friend {

    @Override
    public void message(String message){
        System.out.println("К ноге!");
    }
}
