package com.example.arraylist.exercise4;
import java.util.Calendar;  
import java.util.Date;  

public class Book {
    private String bookID;
    private String bookName;
    private String bookAuthor;
    private int bookPages;
    private String bookGenre;
    private double bookRating;
    private String bookPublishedYear;
    private String bookPublisher;
    private double bookPrice;
    private int copies;
    public Book(String bookID, String bookName, String bookAuthor, int bookPages, String bookGenre,  double bookRating, String publishedYear, String bookPublisher, double bookPrice,int copies) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPages = bookPages;
        this.bookGenre = bookGenre;
        this.bookRating = bookRating;
        this.bookPublishedYear = publishedYear;
        this.bookPublisher = bookPublisher;
        this.bookPrice = bookPrice;
        this.copies=copies;
    }    
    //get
    public String getBookID() {  
        return bookID;  
    }  
  
    public String getBookName() {  
        return bookName;  
    }  
  
    public String getBookAuthor() {  
        return bookAuthor;  
    }  
  
    public int getBookPages() {  
        return bookPages;  
    }  
  
    public String getBookGenre() {  
        return bookGenre;  
    }  
  
    public double getBookRating() {  
        return bookRating;  
    }  
  
    public String getBookPublishedYear() {
        return bookPublishedYear;  
    }  
  
    public String getBookPublisher() {  
        return bookPublisher;  
    }  
  
    public double getBookPrice() {  
        return bookPrice;  
    }  
  
    public int getcopies(){
        return copies;
    }

    // Setters  
    public void setBookID(String bookID) {  
        this.bookID = bookID;  
    }  
  
    public void setBookName(String bookName) {  
        this.bookName = bookName;  
    }  
  
    public void setBookAuthor(String bookAuthor) {  
        this.bookAuthor = bookAuthor;  
    }  
  
    public void setBookPages(int bookPages) {  
        this.bookPages = bookPages;  
    }  
  
    public void setBookGenre(String bookGenre) {  
        this.bookGenre = bookGenre;  
    }  
  
    public void setBookRating(double bookRating) {  
        this.bookRating = bookRating;  
    }  
  
    public void setBookPublishedYear(String PublishedYear) {
        this.bookPublishedYear= PublishedYear;
    }  
  
    public void setBookPublisher(String bookPublisher) {  
        this.bookPublisher = bookPublisher;
    }  
  
    public void setBookPrice(double bookPrice) {  
        this.bookPrice = bookPrice;  
    }  

    public void setcopies(int copies){
        this.copies=copies;
    }

    @Override
    public String toString() {
        return "Book ID:" + bookID +
                "Book Name:" + bookName +
                "Book Author:" + bookAuthor +
                "Book Pages:" + bookPages +
                "Book Genre:" + bookGenre +
                "Book Rating:" + bookRating +
                "Book Published Year:" + bookPublishedYear +
                "Book Publisher:" + bookPublisher +
                "Book Price:" + bookPrice +
                "Book Copies:" + copies;
    }
    ///////////////////////////toString方法重写
}
