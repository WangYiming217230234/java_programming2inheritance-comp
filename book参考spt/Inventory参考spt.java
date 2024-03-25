package com.example.arraylist.exercise4;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
   public ArrayList<Book> books;

    public Inventory() {
        books = new ArrayList<>(); 
    }

    public void enterBookDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the  number of the ordered books:");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Enter the book id: ");
            String bookID = scanner.next();
            System.out.println("Enter the book name: ");
            String bookName = scanner.next();
            System.out.println("Enter the writer name: ");
            String bookAuthor = scanner.next();
            System.out.println("Enter the book page：");
            int bookPages = scanner.nextInt();
            System.out.println("Enter the book genre：");
            String bookGenre = scanner.next();
            System.out.println("Enter the book rating ");
            double bookRating = scanner.nextDouble();
            System.out.println("Enter the bookPublishedYear：");
            String bookPublishedYear = scanner.nextLine();
            System.out.println("Enter the book bookPublisher：");
            String bookPublisher = scanner.next();
            System.out.println("Enter the book bookPrice：");
            double bookPrice = scanner.nextDouble();
            System.out.println("Enter the book copies：");
            int copies = scanner.nextInt();

            Book book = new Book(bookID, bookName, bookAuthor, bookPages, bookGenre, bookRating, bookPublishedYear, bookPublisher, bookPrice, copies);
            books.add(book);
        }
    }

    public void addBooks(String bookID, String bookName, String bookAuthor, int bookPages, String bookGenre, double bookRating, String bookPublishedYear, String bookPublisher, double bookPrice, int copies) {
        Book book = new Book(bookID, bookName, bookAuthor, bookPages, bookGenre, bookRating, bookPublishedYear, bookPublisher, bookPrice, copies);
        books.add(book);
    }

    public boolean removeBooks(String bookID) {
        for (Book book : books) {
            if (book.getBookID().equals(bookID)) {
                books.remove(book);
                System.out.println("the book ");
                return true;
            }
        }
        return false;
    }

    public void updateBooks(String bookID, String bookName, String bookAuthor, int bookPages, String bookGenre, double bookRating, String bookPublishedYear, String bookPublisher, double bookPrice, int copies) {
        for (Book book : books) {
            if (book.getBookID().equals(bookID)) {
                if (bookName != null&& !bookName.equals("null")) {
                    book.setBookName(bookName);
                }
                if (bookAuthor != null&& !bookAuthor.equals("null")) {
                    book.setBookAuthor(bookAuthor);
                }
                if (bookPages != 0) {
                    book.setBookPages(bookPages);
                }
                if (bookGenre != null&& !bookGenre.equals(("null"))) {
                    book.setBookGenre(bookGenre);
                }
                if (bookRating != 0) {
                    book.setBookRating(bookRating);
                }
                if (bookPublishedYear != null&& !bookPublishedYear.equals("null")) {
                    book.setBookPublishedYear(bookPublishedYear);
                }
                if (bookPublisher != null&& !bookPublisher.equals("null")) {
                    book.setBookPublisher(bookPublisher);
                }
                if (bookPrice != 0) {
                    book.setBookPrice(bookPrice);
                }
                if (copies != 0) {
                    book.setCopies(copies);
                }
                return;
            }
        }
        System.out.println("Sorry not exit.");
    }

    public boolean findBooks(String bookID) {
        for (Book book : books) {
            if (book.getBookID().equals(bookID)) {
                System.out.println(book);
                return true;
            }
        }
        System.out.println("not exit");
        return false;
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }


}