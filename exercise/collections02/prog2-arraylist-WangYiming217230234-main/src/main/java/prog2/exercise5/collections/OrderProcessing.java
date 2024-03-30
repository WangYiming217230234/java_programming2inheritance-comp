package prog2.exercise5.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class OrderProcessing {
    private double transactionAmount;
    private String orderType;
    private String bookOrdered;
    private ArrayList<OrderDetails> orders;
    private HashMap<User, OrderDetails> userOrders;

    public OrderProcessing() {
        this.transactionAmount = 0.0;
        this.orderType = "";
        this.bookOrdered = "";
        this.orders = new ArrayList<>();
        this.userOrders = new HashMap<>();
    }

    public void addOrder() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter your email address: ");
        String email = scanner.nextLine();

        String userID = generateUserID(firstName, lastName);
        String orderID = generateOrderID(userID);
        OrderDetails orderDetails = new OrderDetails(orderID, LocalDate.now());

        User user = new User(firstName, lastName, email, userID);
        user.displayBooksAvailable();

        System.out.println("Enter the book ID you want to order: ");
        String bookID = scanner.nextLine();

        if (user.checkBookExist(bookID)) {
            System.out.println("Do you want to purchase or rent the book? (P/R)");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("P") || choice.equalsIgnoreCase("R")) {
                orderType = choice;
                bookOrdered = user.getBookDetails(bookID);
                orderDetails.setOrderType(orderType);
                orderDetails.setBookOrdered(bookOrdered);
                orders.add(orderDetails);
                userOrders.put(user, orderDetails);
            } else {
                System.out.println("Invalid choice!");
            }
        } else {
            System.out.println("Book not found!");
        }

        System.out.println("Do you want to order more books? (Y/N)");
        String moreBooks = scanner.nextLine();
        if (moreBooks.equalsIgnoreCase("Y")) {
            addOrder();
        }
    }

    public OrderDetails searchUserOrders(String userID) {
        for (User user : userOrders.keySet()) {
            if (user.getUserID().equals(userID)) {
                return userOrders.get(user);
            }
        }
        System.out.println("User not found!");
        return null;
    }

    public void removeUserOrders(String userID) {
        for (User user : userOrders.keySet()) {
            if (user.getUserID().equals(userID)) {
                userOrders.remove(user);
                return;
            }
        }
        System.out.println("User not found!");
    }

    public void displayAllUserOrders() {
        for (User user : userOrders.keySet()) {
            System.out.println("User: " + user.getFullName());
            System.out.println("Order Details: " + userOrders.get(user).toString());
        }
    }

    private String generateUserID(String firstName, String lastName) {
        String userID = "TANLUS" + firstName.substring(0, 5).toUpperCase() + lastName.substring(0, 5).toUpperCase();
        return userID;
    }

    private String generateOrderID(String userID) {
        String orderID = "TANLOD" + LocalDate.now() + userID.substring(6, 9).toUpperCase();
        return orderID;
    }
}
