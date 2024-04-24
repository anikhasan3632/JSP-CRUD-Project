package com.idb.jsp_crud.config;

import java.sql.*;

public class DbConfig {
//    private static String dbUrl = "jdbc:oracle:thin:@//localhost:1521/pdborcl";
//    private static String dbUsername = "crud";
//    private static String dbPassword = "1234";
//    private static String driverClass = "oracle.jdbc.driver.OracleDriver";

    private static String dbUrl = "jdbc:mysql://localhost:3306/jspcrud";
    private static String dbUsername = "root";
    private static String dbPassword = "1234";
    private static String driverClass = "com.mysql.cj.jdbc.Driver";
    private static Connection connection = null;

    static {
        try {
            Class.forName(driverClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void closeStatement(Statement stmt, ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}
