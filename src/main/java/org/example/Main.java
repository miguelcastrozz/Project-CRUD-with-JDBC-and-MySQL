package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do {
            System.out.print("""
                    \nApplication of messages

                    1. Create message
                    2. List messages
                    3. Update message
                    4. Delete message
                    5. Exit

                    ->""");
            option = sc.nextInt();
            switch (option) {
                case 1 -> MessagesService.createMessage();
                case 2 -> MessagesService.listMessages();
                case 3 -> MessagesService.updateMessage();
                case 4 -> MessagesService.deleteMessage();
                default -> System.out.println("Tanks");
            }
        } while (option != 5);
    }

}
