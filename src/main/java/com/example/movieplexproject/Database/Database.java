package com.example.movieplexproject.Database;

import java.sql.Connection;
import java.sql.DriverManager;

import static java.lang.Class.forName;

public class Database {
    private static Database instance;
    private Connection connection;

    private Database(){
if (connection == null){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://php.scweb.ca" + Const.DB_NAME + "?useSSL=false",
                Const.DB_USER, Const.DB_PASS);
        System.out.println("Connection Successfully Connected");
    }
    catch (Exception e) {
        e.printStackTrace();
    }

    }
}

    }

