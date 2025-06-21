package com.skypro.database;

public class OracleDatabase implements Database{

    public void query(String id) {
        System.out.println("oracleDatabase.query" + id);
    }
}
