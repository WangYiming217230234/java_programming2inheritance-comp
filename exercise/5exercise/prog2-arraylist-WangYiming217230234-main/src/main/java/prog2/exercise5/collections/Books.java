package prog2.exercise5.collections;

public enum Books {
    BOOK1("001", "Carrie", "Stephen King", 272, "Horror", 3.98, 1974, "Wings", 14),
    BOOK2("002", "The Firm", "Robin Waterfield / John Grisham", 448, "Thriller", 4.01, 1991, "Addison Wesley Publishing Company", 25),
    BOOK3("003", "Slaughterhouse-Five", "Kurt Vonnegut Jr", 275, "Sci-Fi", 4.1, 1969, "Dial Press", 18),
    BOOK4("004", "The Great Gatsby", "F. Scott Fitzgerald", 188, "Classic", 3.91, 1925, "Scribner", 8),
    BOOK5("005", "American Gods", "Neil Gaiman", 635, "Fantasy", 4.11, 2001, "Harper Collins", 11);

    private final String bookID;
    private final String bookName;
    private final String bookAuthor;
    private final int bookPages;
    private final String bookGenre;
    private final double bookRating;
    private final int bookPublishedYear;
    private final String bookPublisher;
    private final double bookPrice;
    private final double bookRent = 0.5;

    Books(String bookID, String bookName, String bookAuthor, int bookPages, String bookGenre, double bookRating,
          int bookPublishedYear, String bookPublisher, double bookPrice) {
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

    public double getRating() {
        return bookRating;
    }

    public int getBookPublishedYear() {
        return bookPublishedYear;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public double getBookPrice(){
        return bookPrice;
    }

    public double getBookRent() {
        return bookRent;
    }
}