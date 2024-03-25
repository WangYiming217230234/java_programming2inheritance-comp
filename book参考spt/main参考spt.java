package com.example.arraylist.exercise4;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main  
{ 
    private static Scanner reader = new Scanner(System.in);
    public static void main( String[] args )
    {  
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();
        inventory.enterBookDetails();
        boolean option = true;
do {System.out.println("1. Add book");
    System.out.println("2. Remove book");
    System.out.println("3. Update book");
    System.out.println("4. Search book");
    System.out.println("5. Display inventory");
    System.out.println("6. Exit");
    System.out.print("Enter your choice: ");
    int choice = scanner.nextInt();
    scanner.nextLine();
    switch (choice){
        case 1:

            System.out.println("Enter the  number of the ordered books:");
            int num = scanner.nextInt();

            for (int i = 0; i < num; i++) {Scanner reader = new Scanner(System.in);
                System.out.println("Enter the book id: ");
                String bookID = reader.nextLine();
                System.out.println("Enter the book name: ");
                String bookName = reader.nextLine();
                System.out.println("Enter the writer name: ");
                String bookAuthor = reader.nextLine();
                System.out.println("Enter the book page：");
                int bookPages = reader.nextInt();
                reader.nextLine();
                System.out.println("Enter the book genre：");
                String bookGenre = reader.nextLine();
                System.out.println("Enter the book rating ");
                double bookRating = reader.nextDouble();
                System.out.println("Enter the bookPublishedYear：");
                String bookPublishedYear = reader.nextLine();
                System.out.println("Enter the book bookPublisher：");
                String bookPublisher = reader.next();
                System.out.println("Enter the book bookPrice：");
                double bookPrice = reader.nextDouble();
                System.out.println("Enter the book copies：");
                int copies = reader.nextInt();
                reader.nextLine();
            inventory.addBooks(bookID,bookName,bookAuthor,bookPages,bookGenre,bookRating,bookPublishedYear,bookPublisher,bookPrice,copies);}
        case 2:
            System.out.println("Enter the book id: ");
            String bookid = reader.nextLine();
            inventory.removeBooks(bookid);

        case 3:
            System.out.println("please enter null if you don not want to update it ");
            System.out.println("DO you want to update the book id: ");
            String bookID = reader.nextLine();
            System.out.println("DO you want to update the book name: ");
            String bookName = reader.nextLine();
            System.out.println("DO you want to update the book writer: ");
            String bookAuthor = reader.nextLine();
            System.out.println("DO you want to update the book page：");
            int bookPages = reader.nextInt();
            reader.nextLine();
            System.out.println("DO you want to update the book genre：");
            String bookGenre = reader.nextLine();
            System.out.println("DO you want to update the  book rating ");
            double bookRating = reader.nextDouble();
            System.out.println("DO you want to update the bookPublishedYear：");
            String bookPublishedYear = reader.nextLine();
            System.out.println("DO you want to update the  bookPublisher：");
            String bookPublisher = reader.next();
            System.out.println("DO you want to update the book bookPrice：");
            double bookPrice = reader.nextDouble();
            System.out.println("DO you want to update the  book copies：");
            int copies = reader.nextInt();
            reader.nextLine();
            inventory.updateBooks(bookID,bookName,bookAuthor,bookPages,bookGenre,bookRating,bookPublishedYear,bookPublisher,bookPrice,copies);

        case 4: System.out.println("Enter the book id: ");
            bookid = reader.nextLine();
            inventory.findBooks(bookid);

        case 5:
            inventory.displayBooks();

        case 6:
            option = true;
    }

}while (option);




    }
}
