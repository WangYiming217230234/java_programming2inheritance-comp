package exercise6.composition.file.io.OrderProcessing;

import java.io.BufferedWriter;  
import java.io.FileWriter;  
import java.io.IOException;  
  
  
public class InvoiceGenerator {  
  
    public void generateInvoice(String bookDetailsLine, String orderID) {  
        String userId = "TANLUSMITCH";  
        String firstName = "Mitchell";  
        String lastName = "Johnson";  
        String email = "randomemail@random.com";  
        String[] bookDetails = bookDetailsLine.split(",");  
  
        // Parse the book details  
        String bookId = bookDetails[0];  
        String bookName = bookDetails[1];  
        String bookAuthor = bookDetails[2];  
        String bookPublisher = bookDetails[3];  
        double bookPrice = Double.parseDouble(bookDetails[4]);  
        String orderType = bookDetails[5];  
  
        // Generate the invoice content  
        StringBuilder invoiceContent = new StringBuilder();  
        invoiceContent.append("INVOICE FOR ORDER ID: ").append(orderID).append("\n");  
        invoiceContent.append("*******************************************************\n");  
        invoiceContent.append("User ID: ").append(userId).append("\n");  
        invoiceContent.append("User First Name: ").append(firstName).append("\n");  
        invoiceContent.append("User Last Name: ").append(lastName).append("\n");  
        invoiceContent.append("User Email: ").append(email).append("\n");  
        invoiceContent.append("Order ID: ").append(orderID).append("\n");  
        invoiceContent.append("Ordered Book(s): \n");  
        invoiceContent.append("Book ID: ").append(bookId).append("\n");  
        invoiceContent.append("Book Name: ").append(bookName).append("\n");  
        invoiceContent.append("Book Author: ").append(bookAuthor).append("\n");  
        invoiceContent.append("Book Publisher: ").append(bookPublisher).append("\n");  
        invoiceContent.append("Book Price: ").append(bookPrice).append("\n");  
        invoiceContent.append("Order Type: ").append(orderType).append("\n");  
        invoiceContent.append("Order Date: 2024-04-04\n");  
        invoiceContent.append("Order Transaction Amount: ").append(bookPrice).append("\n");  
        invoiceContent.append("***********************************************************\n");  
        invoiceContent.append("THANK YOU FOR YOUR SHOPPING WITH\n");  
        invoiceContent.append("TURN-A-NEW-LEAF BOOKSTORE\n");  
  
        // Write the invoice content to the Invoice.txt file  
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Invoice.txt"))) {  
            writer.write(invoiceContent.toString());  
        } catch (IOException e) {  
            e.printStackTrace();  
        }
    }
}