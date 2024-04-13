package exercise6.composition.file.io.ModelClasses;
import java.time.LocalDate;
import java.util.ArrayList;

public class OrderDetails {  
    private String orderID;  
    private double orderTransactionAmount;  
    private LocalDate orderDate;  
    private ArrayList<String> orderedBook;  
    private ArrayList<String> orderType;
      
  
    public OrderDetails(String orderID, LocalDate orderDate) {  
        this.orderID = orderID;  
        this.orderDate = orderDate;  
        this.orderedBook = new ArrayList<>();  
        this.orderType = new ArrayList<>();  
    }  
  
      
    public OrderDetails(String orderID2, String string, String string2) {
    }

    

    public String getOrderID() {  
        return orderID;  
    }  
  
    public double getOrderTransactionAmount() {  
        return orderTransactionAmount;  
    }  
  
    public LocalDate getOrderDate() {  
        return orderDate;  
    }  
  
    public ArrayList<String> getOrderedBook() {  
        return orderedBook;  
    }  
  
    public ArrayList<String> getOrderType() {  
        return orderType;  
    }  
  
     
    public void setOrderTransactionAmount(double orderTransactionAmount) {  
        this.orderTransactionAmount = orderTransactionAmount;  
    }  


    public void setOrderedBook(String bookDetails) {  
        orderedBook.add(bookDetails);  
    }  
  
    public void setOrderType(String orderType) {  
        this.orderType.add(orderType);  
    }
    
    
    @Override  
    public String toString() {  
        return "Order ID: " + orderID + "\n" +  
               "Ordered Book: " + orderedBook + "\n" +  
               "Order Date: " + orderDate + "\n" +  
               "Order Transaction Amount: " + orderTransactionAmount;  
    }
}