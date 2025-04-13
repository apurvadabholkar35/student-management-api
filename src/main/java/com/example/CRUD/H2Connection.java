//package com.example.CRUD;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class H2Connection {
//
//    public static void main(String[] args) {
//        String jdbcUrl = "jdbc:h2:mem:testdb"; 
//        String username = "sa";             
//        String password = "";                 
//        Connection connection = null;
//
//        try {
//            Class.forName("org.h2.Driver");
//
//            System.out.println("Connecting to H2 database...");
//            connection = DriverManager.getConnection(jdbcUrl, username, password);
//            System.out.println("Successfully connected to H2 database!");
//
//            
//
//        } catch (ClassNotFoundException e) {
//            System.err.println("Error: H2 Driver class not found.");
//            e.printStackTrace();
//        } catch (SQLException e) {
//            System.err.println("Error connecting to the database: " + e.getMessage());
//            e.printStackTrace();
//        } finally {
//            if (connection != null) {
//                try {
//                    connection.close();
//                    System.out.println("Connection closed.");
//                } catch (SQLException e) {
//                    System.err.println("Error closing the connection: " + e.getMessage());
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//}