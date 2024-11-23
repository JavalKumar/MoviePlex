package com.example.movieplexproject.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

import static com.example.movieplexproject.Database.Const.*;

public class Database {
    private static Database instance;
    private Connection connection;

    private Database(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost/" + DB_NAME +
                                    "?serverTimeZone=UTC",
                            DB_USER,
                            DB_PASS);
            System.out.println("Created Connection!");
            createTable(DBConst.MOVIE_TABLE, DBConst.CREATE_TABLE_MOVIE, connection);
            createTable(DBConst.EMPLOYEE_TABLE, DBConst.CREATE_TABLE_EMPLOYEE, connection);
            createTable(DBConst.USER_TABLE, DBConst.CREATE_TABLE_USER, connection);
            createTable(DBConst.MOVIE_EMPLOYEE_TABLE, DBConst.CREATE_TABLE_MOVIE_EMPLOYEE, connection);
            createTable(DBConst.MOVIE_USER_TABLE, DBConst.CREATE_TABLE_MOVIE_USER, connection);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static Database getInstance() {
        if(instance == null){
            instance = new Database();
        }
        return instance;
    }

    public void createTable(String tableName, String tableQuery, Connection connection) throws SQLException {
        Statement createTable;
        DatabaseMetaData md = connection.getMetaData();
        ResultSet resultSet = md.getTables("jpatel8project", null, tableName, null);
        if(resultSet.next()){
            System.out.println(tableName + " table already exists");
        }
        else{
            createTable = connection.createStatement();
            createTable.execute(tableQuery);
            System.out.println("The " + tableName + " table has been created");
        }
    }

    public Connection getConnection() {
        return connection;
    }
}

