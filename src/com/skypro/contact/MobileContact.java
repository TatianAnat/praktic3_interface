package com.skypro.contact;

public class MobileContact extends Contact{

    private String contryCode;
    private String operatorCode;
    private String number;

    public MobileContact(String contryCode, String operatorCode, String number) {
        this.contryCode = contryCode;
        this.operatorCode = operatorCode;
        this.number = number;
    }

    @Override
    public void call() {
        System.out.println("Вызов + "+ contryCode + "(" + operatorCode + ")" + number);
    }
}
