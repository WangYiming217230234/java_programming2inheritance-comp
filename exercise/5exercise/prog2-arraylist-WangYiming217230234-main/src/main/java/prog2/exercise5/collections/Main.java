package prog2.exercise5.collections;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OrderProcessing orderProcessing = new OrderProcessing();
        Scanner reader = new Scanner(System.in);

        System.out.println("Welcome to the Turn-A-New-Leaf Bookstore" + "\n");

        int choice = 0;
        do {
            System.out.println("\nPlease select an option:" + "\n");
            System.out.println("Type1. Place new orders" + "\n");
            System.out.println("Type2. Search for a user's order" + "\n");
            System.out.println("Type3. Remove a user's order" + "\n");
            System.out.println("Type4. Display all orders" + "\n");
            System.out.println("Type5. Quit" + "\n");

            choice = reader.nextInt();
            reader.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    orderProcessing.addOrder();
                    break;
                case 2:
                    System.out.println("Enter the user ID to search for the order:");
                    String idToSearch = reader.nextLine();
                    orderProcessing.searchUserOrders(idToSearch);
                    
                case 3:
                    System.out.println("Enter the user ID to remove the order:");
                    String idToRemove = reader.nextLine();
                    orderProcessing.removeUserOrders(idToRemove);
                    break;
                case 4:
                    orderProcessing.displayAllUserOrders();
                    break;
                case 5:
                    System.out.println("Thank you for using the Turn-A-New-Leaf Bookstore!");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }while(choice != 6);
        reader.close();
    }
}