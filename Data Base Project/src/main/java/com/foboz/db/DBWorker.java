package com.foboz.db;

import java.sql.*;

public class DBWorker {
    private final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private final String USERNAME = "root";
    private final String PASSWORLD = "root";

    private Connection connection;

    public DBWorker() {
        try{
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORLD);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
