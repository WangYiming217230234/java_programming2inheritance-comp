package exercise6.composition.file.io.ModelClasses;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookCollection {  
    private List<Book> books;  
  
    public BookCollection() {  
        this.books = new ArrayList<>();  
    }  
  
    public List<Book> getBooks() {  
        return books;  
    }  
  
    public void setBooks(List<Book> books) {  
        this.books = books;  
    }  
  
    public void addCollection(String filePath) {  
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {  
            String line;  
            while ((line = reader.readLine()) != null) {  
                String[] details = line.split(";");  
                Book book = new Book(details[0], details[1], details[2], Integer.parseInt(details[3]), line, 0, 0, line, 0);  
                books.add(book);  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
  
    public Book searchBookByID(String id) {  
        for (Book book : books) {  
            if (book.getBookID() .equals(id)) {  
                return book;  
            }  
        }  
        return null;  
    }  
  
    @Override  
    public String toString() {  
        StringBuilder sb = new StringBuilder();  
        for (Book book : books) {  
            sb.append(book.toString()).append("\n");  
        }  
        return sb.toString();  
    }  
}