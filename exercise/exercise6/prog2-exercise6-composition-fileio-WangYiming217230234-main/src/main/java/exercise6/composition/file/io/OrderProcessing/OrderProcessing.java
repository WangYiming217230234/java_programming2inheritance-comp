package exercise6.composition.file.io.OrderProcessing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import exercise6.composition.file.io.ModelClasses.Book;
import exercise6.composition.file.io.ModelClasses.BookCollection;
import exercise6.composition.file.io.ModelClasses.OrderDetails;
import exercise6.composition.file.io.ModelClasses.User;


public class OrderProcessing {
    Scanner scanner = new Scanner(System.in);
    private double transactionAmount;
    private String orderType;
    private String bookOrdered;
    public ArrayList<OrderDetails> orders=new ArrayList<>();
    static public HashMap<User, OrderDetails> userOrders=new HashMap<>();
    public void addOrder(BookCollection bookCollection) {
       System.out.println("Enter your first name: ");
         String firstName = scanner.nextLine();
            System.out.println("Enter your last name: ");
            String lastName = scanner.nextLine();
            System.out.println("Enter your email address: ");
            String userEmail = scanner.nextLine();
            String userID = generateUserID(firstName, lastName);
            String orderID = generateOrderID(userID);
            OrderDetails orderDetails = new OrderDetails(orderID, java.time.LocalDate.now());
            User user = new User(firstName, lastName, userEmail, userID);
            while (true){
            System.out.println("Enter the book ID you want to order: ");
            String bookID = scanner.nextLine();
            Book book=bookCollection.searchBookByID(bookID);
            if (book != null) {
                System.out.println("You want to order it for purchase or rent? ");
                orderType = scanner.nextLine();
                bookOrdered = "Book ID: " + book.getBookID() + "\nBook Name: " + book.getBookName() + "\nBook Author: " + book.getBookAuthor() + "\nBook Publisher: " + book.getBookPublisher() + "\nBook Price: " + book.getBookPrice();
                orderDetails.setOrderedBook(bookOrdered);
                orderDetails.setOrderType(orderType);
                System.out.println("Do you want to order more books? ");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("yes")) {
                }else{
                    break;
                }
                }
            }
            userOrders.put(user, orderDetails);
    }
    public String generateUserID(String firstName, String lastName) {
        String name = firstName + lastName;
        return "TANLUS" + name.substring(0, 5).toUpperCase();
    }
    public String generateOrderID(String userID) {
        return "TANLOD" + java.time.LocalDate.now() + userID.substring(6, 9).toUpperCase();
    }
    public OrderDetails searchUserOrders(String userID) {
        for (User user : userOrders.keySet()) {
            if (user.getUserID().equals(userID)) {
                System.out.println(userOrders.get(user));
                return userOrders.get(user);
            }
        }
        return null;
    }
    public void removeUserOrders(String userID) {
        for (User user : userOrders.keySet()) {
            if (user.getUserID().equals(userID)) {
                userOrders.remove(user);
                return;
            }
        }
    }
    public void displayAllUserOrders() {
        for (User user : userOrders.keySet()) {
            System.out.println(user);
            System.out.println(userOrders.get(user));
        }
    }
    public HashMap<User, OrderDetails> getOrders() {
        return userOrders;
    }

    public void displayAllOrders() {
        for (User user : userOrders.keySet()) {
            System.out.println(user);
            System.out.println(userOrders.get(user));
        }
    }

    public void addUserOrders(User user, OrderDetails orderDetails) {  
        userOrders.put(user, orderDetails);  
    }  

    public Collection<User> getHashMapKey() {  
        if (userOrders.isEmpty()) {  
            System.out.println("Sorry, the order list is empty");  
            return Collections.emptyList();  
        }  
        return userOrders.keySet();  
    }  
  
    public Collection<OrderDetails> getHashMapValues() {  
        if (userOrders.isEmpty()) {  
            System.out.println("Sorry, the order list is empty");  
            return Collections.emptyList();  
        }  
        return userOrders.values();  
    }  
  
    public boolean isHashMapEmpty() {  
        return userOrders.isEmpty();  
    }  

    public static void prepareInvoiceDetails(User user, OrderDetails orderDetails, String orderID) {  
         StringBuilder invoiceText = new StringBuilder();
    }
}
