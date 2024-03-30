package prog2.exercise5.collections;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OrderProcessing orderProcessing = new OrderProcessing();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Turn-A-New-Leaf Bookstore");

        int option = 0;
        while (option != 5) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Place new orders");
            System.out.println("2. Search for a user's order");
            System.out.println("3. Remove a user's order");
            System.out.println("4. Display all orders");
            System.out.println("5. Quit");

            option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (option) {
                case 1:
                    orderProcessing.addOrder();
                    break;
                case 2:
                    System.out.println("Enter the user ID to search for the order:");
                    String userID = scanner.nextLine();
                    OrderDetails orderDetails = orderProcessing.searchUserOrders(userID);
                    if (orderDetails != null) {
                        System.out.println("Order Details: " + orderDetails.toString());
                    }
                    break;
                case 3:
                    System.out.println("Enter the user ID to remove the order:");
                    userID = scanner.nextLine();
                    orderProcessing.removeUserOrders(userID);
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
        }
    }
}