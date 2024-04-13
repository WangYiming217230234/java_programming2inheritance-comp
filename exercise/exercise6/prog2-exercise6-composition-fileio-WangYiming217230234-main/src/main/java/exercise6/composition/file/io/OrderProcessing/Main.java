package exercise6.composition.file.io.OrderProcessing;

import java.util.Scanner;

public class Main{
public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);  
          
        System.out.println("Welcome to the Turn-A-New-Leaf Bookstore");  
          
        System.out.println("Please select an option:");  
        System.out.println("Type 1 to place new orders.");  
        System.out.println("Type 2 to search for a user's order.");  
        System.out.println("Type 3 to remove a user's order.");  
        System.out.println("Type 4 to display all of the orders.");  
        System.out.println("Type 5 to quit.");  
          
        int choice = scanner.nextInt();  
          
        switch (choice) {  
            case 1:  
                System.out.println("Placing new orders...");  
                break;  
            case 2:  
                System.out.println("Searching for a user's order...");  
                break;  
            case 3:  
                System.out.println("Removing a user's order...");  
                break;  
            case 4:  
                System.out.println("Displaying all orders...");  
                break;  
            case 5:  
                System.out.println("Exiting the Turn-A-New-Leaf Bookstore.");  
                scanner.close();  
                System.exit(0);  
            default:  
                System.out.println("Invalid option. Please try again.");  
        }   
            InvoiceGenerator generator = new InvoiceGenerator();  
            String bookDetailsLine = "B020,Fahrenheit 451,Ray Bradbury,Ballantine,30.0,Purchase";  
            String orderID = "TANLOD2024-04-04MIT";  
            generator.generateInvoice(bookDetailsLine, orderID);  
    }  
}