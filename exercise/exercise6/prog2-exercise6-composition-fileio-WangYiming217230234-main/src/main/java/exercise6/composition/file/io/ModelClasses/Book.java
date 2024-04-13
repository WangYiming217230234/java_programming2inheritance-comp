package exercise6.composition.file.io.ModelClasses;

public class Book{

    private String bookID;
    private String bookName;
    private String bookAuthor;
    private int bookPages;
    private String bookGenre;
    private double bookRating;
    private int bookPublishedYear;
    private String bookPublisher;
    private double bookPrice;
    private double bookRent = 0.5;

    public Book(String bookID, String bookName, String bookAuthor, int bookPages, String bookGenre, double bookRating,
    int bookPublishedYear, String bookPublisher, double bookPrice){
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPages = bookPages;
        this.bookGenre = bookGenre;
        this.bookRating = bookRating;
        this.bookPublishedYear = bookPublishedYear;
        this.bookPublisher = bookPublisher;
        this.bookPrice = bookPrice;
    }
    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookPages() {
        return bookPages;
    }

    public void setBookPages(int bookPages) {
        this.bookPages = bookPages;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public double getBookRating() {
        return bookRating;
    }

    public void setBookRating(double bookRating) {
        this.bookRating = bookRating;
    }

    public int getBookPublishedYear() {
        return bookPublishedYear;
    }

    public void setBookPublishedYear(int bookPublishedYear) {
        this.bookPublishedYear = bookPublishedYear;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public double getBookRent() {
        return bookRent;
    }

    public void setBookRent(double bookRent) {
        this.bookRent = bookRent;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookID +
                "\nBook Name: " + bookName +
                "\nAuthor: " + bookAuthor +
                "\nTotal Pages: " + bookPages +
                "\nGenre: " + bookGenre +
                "\nPublished Year: " + bookPublishedYear +
                "\nPublisher: " + bookPublisher +
                "\nPrice: " + bookPrice;
    }
}


