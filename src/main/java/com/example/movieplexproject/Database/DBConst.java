package com.example.movieplexproject.Database;


import java.sql.*;

public class DBConst {
    /**
     * Movie Table
     */
    public static final String MOVIE_TABLE = "movie";
    public static final String MOVIE_COLUMN_ID = "id";
    public static final String MOVIE_COLUMN_NAME = "name";
    public static final String MOVIE_COLUMN_RATING = "rating";
    public static final String MOVIE_COLUMN_GENRE = "genre";
    public static final String MOVIE_COLUMN_SCREEN = "screen";
    public static final String MOVIE_COLUMN_LENGTH = "length";


    /**
     * Employee Table
     */
    public static final String EMPLOYEE_TABLE = "employee";
    public static final String EMPLOYEE_COLUMN_ID = "id";
    public static final String EMPLOYEE_COLUMN_FIRST_NAME = "first_name";
    public static final String EMPLOYEE_COLUMN_LAST_NAME = "last_name";
    public static final String EMPLOYEE_COLUMN_EMAIL = "email";


    /**
     * User Table
     */
    public static final String USER_TABLE = "user";
    public static final String USER_COLUMN_ID = "id";
    public static final String USER_COLUMN_FIRST_NAME = "first_name";
    public static final String USER_COLUMN_LAST_NAME = "last_name";
    public static final String USER_COLUMN_CONTACT = "contact";


    /**
     * Movie Employee Table
     */
    public static final String MOVIE_EMPLOYEE_TABLE = "movie_employee";
    public static final String MOVIE_EMPLOYEE_COLUMN_ID = "id";
    public static final String MOVIE_EMPLOYEE_COLUMN_MOVIE_ID = MOVIE_COLUMN_ID;
    public static final String MOVIE_EMPLOYEE_COLUMN_EMPLOYEE_ID = EMPLOYEE_COLUMN_ID;

    /**
     * Movie User Table
     */

    public static final String MOVIE_USER_TABLE = "movie_user";
    public static final String MOVIE_USER_COLUMN_ID = "id";
    public static final String MOVIE_USER_COLUMN_MOVIE_ID = MOVIE_COLUMN_ID;
    public static final String MOVIE_USER_COLUMN_USER_ID = USER_COLUMN_ID ;

    public static final String CREATE_TABLE_MOVIE =
            "CREATE TABLE " + MOVIE_TABLE + " (" +
            MOVIE_COLUMN_ID + " INT NOT NULL AUTO_INCREMENT, " +
            MOVIE_COLUMN_NAME + " VARCHAR(100), " +
            MOVIE_COLUMN_RATING + " DECIMAL(3, 2), " +
            MOVIE_COLUMN_GENRE + " VARCHAR(50), " +
            MOVIE_COLUMN_SCREEN + " VARCHAR(20), " +
            MOVIE_COLUMN_LENGTH + " INT, " +
            "PRIMARY KEY(" + MOVIE_COLUMN_ID + "));";

    public static final String CREATE_TABLE_EMPLOYEE =
            "CREATE TABLE " + EMPLOYEE_TABLE + " (" +
            EMPLOYEE_COLUMN_ID + " INT NOT NULL AUTO_INCREMENT, " +
            EMPLOYEE_COLUMN_FIRST_NAME + " VARCHAR(50), " +
            EMPLOYEE_COLUMN_LAST_NAME + " VARCHAR(50), " +
            EMPLOYEE_COLUMN_EMAIL + " VARCHAR(100), " +
            "PRIMARY KEY(" + EMPLOYEE_COLUMN_ID + "));";

    public static final String CREATE_TABLE_USER =
            "CREATE TABLE " + USER_TABLE + " (" +
            USER_COLUMN_ID + " INT NOT NULL AUTO_INCREMENT, " +
            USER_COLUMN_FIRST_NAME + " VARCHAR(50), " +
            USER_COLUMN_LAST_NAME + " VARCHAR(50), " +
            USER_COLUMN_CONTACT + " VARCHAR(15), " +
            "PRIMARY KEY(" + USER_COLUMN_ID + "));";

    public static final String CREATE_TABLE_MOVIE_EMPLOYEE =
            "CREATE TABLE " + MOVIE_EMPLOYEE_TABLE + " (" +
            MOVIE_EMPLOYEE_COLUMN_ID + " INT NOT NULL AUTO_INCREMENT, " +
            MOVIE_EMPLOYEE_COLUMN_MOVIE_ID + " INT, " +
            MOVIE_EMPLOYEE_COLUMN_EMPLOYEE_ID + " INT, " +
            "PRIMARY KEY(" + MOVIE_EMPLOYEE_COLUMN_ID + "), " +
            "FOREIGN KEY (" + MOVIE_EMPLOYEE_COLUMN_MOVIE_ID + ") " +
            "REFERENCES " + MOVIE_TABLE + "(" + MOVIE_COLUMN_ID + "), " +
            "FOREIGN KEY (" + MOVIE_EMPLOYEE_COLUMN_EMPLOYEE_ID + ") " +
            "REFERENCES " + EMPLOYEE_TABLE + "(" + EMPLOYEE_COLUMN_ID + "));";

    public static final String CREATE_TABLE_MOVIE_USER =
            "CREATE TABLE " + MOVIE_USER_TABLE + " (" +
            MOVIE_USER_COLUMN_ID + " INT NOT NULL AUTO_INCREMENT, " +
            MOVIE_USER_COLUMN_MOVIE_ID + " INT, " +
            MOVIE_USER_COLUMN_USER_ID + " INT, " +
            "PRIMARY KEY(" + MOVIE_USER_COLUMN_ID + "), " +
            "FOREIGN KEY (" + MOVIE_USER_COLUMN_MOVIE_ID + ") " +
            "REFERENCES " + MOVIE_TABLE + "(" + MOVIE_COLUMN_ID + "), " +
            "FOREIGN KEY (" + MOVIE_USER_COLUMN_USER_ID + ") " +
            "REFERENCES " + USER_TABLE + "(" + USER_COLUMN_ID + "));";

    public void createTable(String tableName, String tableQuery, Connection connection) throws SQLException {
        Statement createTables;
        DatabaseMetaData md = connection.getMetaData();
        ResultSet result = md.getTables(null, null, tableName, null);
        if(result.next()) {
            System.out.println(tableName + "Table already exist!");
        }
        else {
            createTables = connection.createStatement();
            boolean inserted = createTables.execute(tableQuery);
            System.out.println("The" + tableName + "Table has been inserted:" + !inserted );
        }
    }

}
