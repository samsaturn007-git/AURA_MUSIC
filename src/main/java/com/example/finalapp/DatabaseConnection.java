package com.example.finalapp;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public Connection databaselink;

    public Connection getConnection() {
        String databaseName = "aura";
        String databaseUser = "root";
        String databasePassword = "oracle";
        String url = "jdbc:mysql://localhost:3306/" + databaseName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaselink = DriverManager.getConnection(url, databaseUser, databasePassword);

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
//            System.out.println("NOT DONE");
        }

        return databaselink;
    }
}
