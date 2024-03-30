package prog2.exercise5.collections;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OrderProcessing {
    private double transactionAmount;
    private String orderType;
    private String bookOrdered;
    private ArrayList<OrderDetails> orders = new ArrayList<>();
    HashMap<User, OrderDetails> userOrders = new HashMap<>();
    
    public OrderProcessing() {}

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getBookOrdered() {
        return bookOrdered;
    }

    public void setBookOrdered(String bookOrdered) {
        this.bookOrdered = bookOrdered;
    }

    public ArrayList<OrderDetails> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<OrderDetails> orders) {
        this.orders = orders;
    }

    public HashMap<User, OrderDetails> getUserOrders() {
        return userOrders;
    }

    public void setUserOrders(HashMap<User, OrderDetails> userOrders) {
        this.userOrders = userOrders;
    }

    @Override
    public String toString() {
        return "OrderProcessing [transactionAmount=" + transactionAmount + ", orderType=" + orderType + ", bookOrdered="
                + bookOrdered + ", orders=" + orders + ", userOrders=" + userOrders + "]";
    }

    public void addOrder(){
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the first name of the user:");
        String firstname = reader.nextLine();
                    
        System.out.println("Enter the last name of the user:");
        String lastname = reader.nextLine();
                    
        System.out.println("Enter the email address of the user:");
        String emailAddress = reader.nextLine();
                    
        String userID = generateUserID(firstname, lastname);

        String orderID = generateOrderID(userID);

        System.out.println("It's your user ID: " + userID);
        System.out.println("It's your order ID: " + orderID);

        OrderDetails orderDetails = new OrderDetails(orderID, LocalDate.now());

        User user = new User(firstname, lastname, emailAddress, userID);

        System.out.println("\nThe details of the book:");
        for(Books book: Books.values()){
            System.out.println("[Book ID:" + book.getBookID() + ",Book name:" + book.getBookName() + "]");
        }
        boolean morebook = true;
        while(morebook){
            System.out.println("\nEnter the book ID that you want to order:");
            String wantID = reader.nextLine();
            for(Books book: Books.values()){
                if(wantID.equals(book.getBookID())){
                    System.out.println("How you want to order it?(Purchase/Rent):");
                    String orderType = reader.nextLine();
                    bookOrdered = "Book ID: " + book.getBookID() + "\nBook name: " + book.getBookName();
                    orderDetails.getOrderedBook().add(bookOrdered);
                    orderDetails.getOrderType().add(orderType);
                    if(orderType.equalsIgnoreCase("Purchase")){
                        orderDetails.setOrderTransactionAmount(orderDetails.getOrderTransactionAmount());
                    }else if(orderType.equalsIgnoreCase("Rent")){
                        orderDetails.setOrderTransactionAmount(orderDetails.getOrderTransactionAmount());
                    }
                    userOrders.put(user, orderDetails);
                    System.out.println("Do you want to order more books?(Yes/No)");
                    String want = reader.nextLine();
                    if(want.equalsIgnoreCase("No")){
                        morebook = false;
                        break;
                    }
                }
            }
        }
        reader.close();
    }

    public String generateUserID(String firstName, String lastName){
        String UserID = "TANLUS" + (firstName + lastName).substring(0,5).toUpperCase();
        return UserID;
    }

    public String generateOrderID(String UserID){
        DateTimeFormatter time = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String CurrentDate = LocalDate.now().format(time);
        String OrderID = "TANLOD" + CurrentDate + UserID.substring(6,9);
        return OrderID;
    }

    public void searchUserOrders(String orderID){
        boolean flag = false;
        for(User key: userOrders.keySet()){
            if(key.getUserID().equals(orderID)){
                System.out.println(userOrders.get(key));
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("");
        }
    }

    public void removeUserOrders(String orderID){
        boolean flag = false;
        for(Map.Entry<User, OrderDetails> entry: userOrders.entrySet()){
            if(entry.getKey().getUserID().equals(orderID)){
                userOrders.remove(entry.getKey());
                flag = true;
                break;
            }  
        }
        if(flag){
            System.out.println("Order details for user ID" + orderID + "removed successfully.");
        }else{
            System.out.println("The user ID is not exist.");
        }
    }

    public void displayAllUserOrders(){
        for(User userID: userOrders.keySet()){
            OrderDetails orderDetails = userOrders.get(userID);
            System.out.println(userID + "\n" + orderDetails);
            System.out.println("---------------------------------------------");
        }
    }
}