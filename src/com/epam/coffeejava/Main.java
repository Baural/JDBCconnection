package com.epam.coffeejava;

import com.epam.coffeejava.dao.DbAdapter;

public class Main {

    public static void main(String[] args) {
        DbAdapter dbAdapter = new DbAdapter();
        dbAdapter.connect();
    }
}
