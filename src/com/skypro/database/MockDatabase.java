package com.skypro.database;

public class MockDatabase implements Database {

    @Override
    public void query(String id) {
        System.out.println("MockDatabase.query");
    }
}

