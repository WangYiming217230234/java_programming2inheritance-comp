package com.example.arraylist.exercise4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Inventory {
    public List<Book> books = new ArrayList<>();
    public void enterBookDetails(int choice){
        Scanner reader =new Scanner(System.in);
        switch(choice){
          case 1:  
            System.out.println("How many books the user wants to add.?");
            int num=reader.nextInt();
            for(int i=0;i<num;i++){
                System.out.println("bookID?");
                String id=reader.nextLine();
                System.out.println("bookName?");
                String bookName=reader.nextLine();
                System.out.println("bookAuthor?");
                String bookAuthor=reader.nextLine();
                System.out.println("bookPages?");
                int page=reader.nextInt();
                reader.nextLine();
                System.out.println("bookGenre?");
                String genre=reader.nextLine();
                System.out.println("bookRating?");
                double rate=reader.nextDouble();
                reader.nextLine();
                System.out.println("bookPublishedYear?");//////////////////////Date类型如何输入？
                String pyear=reader.nextLine();
                System.out.println("bookPublisher?");
                String publisher=reader.nextLine();
                System.out.println("bookPrice?");
                double price=reader.nextDouble();
                reader.nextLine();
                System.out.println("copies?");
                int cp=reader.nextInt();
                reader.nextLine();
                addBooks(id,bookName,bookAuthor,page,genre,rate,pyear,publisher,price,cp);///////////////
                break;
            }
            case 2:  
                System.out.println("Enter the ID of the book to remove:");
                String idd=reader.nextLine();
                removeBooks(idd);
            case 3:
                System.out.println("Enter the id of the book you want to update");/////////////////参数
                String id = reader.nextLine();
                System.out.println("Enter the new name of the book you want to update");
                String newName=reader.nextLine();
                System.out.println("Enter the new author,or enter null to break");
                String newAuthor=reader.nextLine();
                System.out.println("Enter the new page,or enter 0 to break");
                int newpage=reader.nextInt();
                reader.nextLine();
                System.out.println("Enter the new genre,or enter null to break");
                String newgenre=reader.nextLine();
                System.out.println("Enter the new rating,or enter 0 to break");
                double newrating=reader.nextDouble();
                reader.nextLine();
                System.out.println("Enter the new year,or enter null to break");
                String newyear=reader.nextLine();
                System.out.println("Enter the new publisher,or enter null to break");
                String newpublisher=reader.nextLine();
                System.out.println("Enter the new price,or enter 0 to break");
                double newprice=reader.nextDouble();
                reader.nextLine();
                System.out.println("Enter the new copy,or enter 0 to break");
                int newcopy=reader.nextInt();
                reader.nextLine();
                updateBooks(id,newName,newAuthor,newpage,newgenre,newrating,newyear,newpublisher,newprice,newcopy);
            case 4:
                System.out.println("Enter the bookID you want to find");
                String ids = reader.nextLine();
                findBooks(ids);
            case 5:
                displayBooks();

        }
    }
    public void addBooks(String bookID, String bookName, String bookAuthor, int bookPages, String bookGenre, double bookRating, String publishedYear, String bookPublisher, double bookPrice, int copies){
        books.add(new Book(bookID, bookName, bookAuthor, bookPages, bookGenre, bookRating, publishedYear, bookPublisher, bookPrice, copies));
    }/////////////////////////////////////////////////

    public boolean removeBooks(String bookId){
        for(Book bok: books){
            if(bookId.equals(bok.getBookID())){
                books.remove(bok);
                return true;
            }
        }////////////////////////布尔值
        return false;
    }

    public void updateBooks(String bookID, String bookName, String bookAuthor, int bookPages, String bookGenre, double bookRating
            , String publishedYear, String bookPublisher, double bookPrice, int copies){
        int selectBookI = -1;
        for(int i=0;i<books.size();i++){
            if(bookID.equals(books.get(i).getBookID())){
                selectBookI = i;
                break;
            }
        }
        if(selectBookI<0) {
            System.out.println("对不起。具有该ID的 书 在 库 存 中 不 存 在");
            return;
        }
        if(!bookName.equals("null"))
            books.get(selectBookI).setBookName(bookName);
        if(!bookAuthor.equals("null"))
            books.get(selectBookI).setBookAuthor(bookAuthor);
        if(bookPages!=0)
            books.get(selectBookI).setBookPages(bookPages);
        if(!bookGenre.equals("null"))
            books.get(selectBookI).setBookGenre(bookGenre);
        if(bookRating!=0)
            books.get(selectBookI).setBookRating(bookRating);
        if(!publishedYear.equals("null"))
            books.get(selectBookI).setBookPublishedYear(publishedYear);
        if(!bookPublisher.equals("null"))
            books.get(selectBookI).setBookPublisher(bookPublisher);
        if(bookPrice!=0)
            books.get(selectBookI).setBookPrice(bookPrice);
        if(copies!=0)
            books.get(selectBookI).setcopies(copies);
    }

    public boolean findBooks(String id){
        for(Book book: books){
            if(id.equals(book.getBookID())){
                //打印书的细节toString method/////////////////////////////////怎么打印对应书的details？
                System.out.println(book.toString());
                return true;
            }
        }
        System.out.println("he book you are looking for is not available");
        return false;
    }

    public void displayBooks(){
        for(Book book: books){
            System.out.println(book.toString());
        }
        //System.out.println("Here is the list of books: " + books);
    }
}
