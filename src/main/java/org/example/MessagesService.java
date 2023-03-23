package org.example;

import java.util.Scanner;

public class MessagesService {

    static Scanner sc = new Scanner(System.in);

    public static void createMessage() {
        System.out.print("Enter your message: ");
        String message = sc.nextLine();
        System.out.print("Enter your name: ");
        String authorMessage = sc.nextLine();
        Messages registration = new Messages(null, message, authorMessage);
        MessagesDAO.createMessageDB(registration);
    }

    public static void listMessages() {
        MessagesDAO.readMessageDB();
    }

    public static void updateMessage() {
        System.out.print("Enter the id: ");
        int idMessage = sc.nextInt();
        System.out.print("Enter your message to update: ");
        String message = sc.nextLine();
        Messages update = new Messages(idMessage, message, null);
        MessagesDAO.updateMessageDB(update);
    }

    public static void deleteMessage() {
        System.out.print("Enter the id to delete: ");
        int idMessage = sc.nextInt();
        MessagesDAO.deleteMessageDB(idMessage);
    }

}
