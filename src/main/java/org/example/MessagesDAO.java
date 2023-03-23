package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MessagesDAO {

    public static void createMessageDB(Messages message) {
        Connecting connectingDB = new Connecting();
        try (Connection connection = connectingDB.getConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO MENSAJES (MENSAJE, AUTOR_MENSAJE) VALUES (?, ?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, message.getMessage());
                ps.setString(2, message.getAuthorMessage());
                ps.executeUpdate();
                System.out.println("Message created");
            } catch (SQLException se) {
                System.out.println("Message not created: " + se);
            }
        } catch (SQLException e) {
            System.out.println("Could not connect: " + e);
        }
    }

    public static void readMessageDB() {
        Connecting connectingDB = new Connecting();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection connection = connectingDB.getConnection()) {
            String query = "SELECT * FROM MENSAJES";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(
                        "Id ......... " + rs.getInt("ID_MENSAJE") + "\n" +
                        "Mensaje .... " + rs.getString("MENSAJE") + "\n" +
                        "Autor ...... " + rs.getString("AUTOR_MENSAJE") + "\n" +
                        "Fecha ...... " + rs.getString("FECHA_MENSAJE") + "\n");
            }
        } catch (SQLException e) {
            System.out.println("Messages could not be retrieved: " + e);
        }

    }

    public static void updateMessageDB(Messages message) {
        Connecting connectingDB = new Connecting();
        ResultSet rs = null;
        try (Connection connection = connectingDB.getConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "UPDATE MENSAJES SET MENSAJE = ? WHERE ID_MENSAJE = ?";
                ps = connection.prepareStatement(query);
                ps.setString(1, message.getMessage());
                ps.setInt(2, message.getIdMessage());
                ps.executeUpdate();
                System.out.println("Message update successfully");
            } catch (SQLException se) {
                System.out.println("Could not update message: " + se);
            }
        } catch (SQLException e) {
            System.out.println("Could not connect: " + e);
        }
    }

    public static void deleteMessageDB(int idMessage) {
        Connecting connectingDB = new Connecting();
        try (Connection connection = connectingDB.getConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM MENSAJES WHERE ID_MENSAJE = ?";
                ps = connection.prepareStatement(query);
                ps.setInt(1, idMessage);
                ps.executeUpdate();
                System.out.println("Message delete successfully");
            } catch (SQLException se) {
                System.out.println("Could not delete message: " + se);
            }
        } catch (SQLException e) {
            System.out.println("Could not connect: " + e);
        }
    }

}
