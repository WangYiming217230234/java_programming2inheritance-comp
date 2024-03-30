package prog2.exercise5.collections;
import java.time.LocalDate;
import java.util.ArrayList;

public class OrderDetails {
    private String orderID;
    private double orderTransactionAmount;
    private LocalDate orderDate;
    ArrayList<String> orderedBook = new ArrayList<>();
    ArrayList<String> orderType = new ArrayList<>();
    public OrderDetails(String orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public double getOrderTransactionAmount() {
        return orderTransactionAmount;
    }

    public void setOrderTransactionAmount(double orderTransactionAmount) {
        this.orderTransactionAmount = orderTransactionAmount;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public ArrayList<String> getOrderedBook() {
        return orderedBook;
    }

    public void setOrderedBook(String book) {
        this.orderedBook.add(book);
    }

    public ArrayList<String> getOrderType() {
        return orderType;
    }

    public void setOrderType(String type) {
        this.orderType.add(type);
    }


    @Override
    public String toString() {
        return "Order ID: " + orderID + "\nOrdered Book: " + orderedBook +
                "\nOrder Date: " + orderDate + "\nOrder Transaction Amount: " + orderTransactionAmount;
    }

    
}
