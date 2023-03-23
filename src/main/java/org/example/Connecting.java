package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connecting {

    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes", "root", "");
            System.out.println("Connection successful");
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e);
        }
        return connection;
    }

}
