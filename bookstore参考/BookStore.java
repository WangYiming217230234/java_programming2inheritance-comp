package prog2.spring2024.exercise2;
import java.time.LocalDate;
import java.util.Scanner;

public class BookStore{


    enum BookDetails {
        Book1("001","Carrie","Stephen King",272,"Horror",3.98,"Wings",1974,14),

        Book2("002","The Firm","Robin Waterfield / John Grisham",448,"Thriller",4.01,"Addison Wesley Publishing Company",1991,25),

        Book3("003","Slaughterhouse-Five","Kurt Vonnegut Jr.",275,"Sci-Fi",4.1,"Dial Press",1969,18),

        Book4("004","The Great Gatsby","F. Scott Fitzgerald",188,"Classic",3.91,"Scribner",1925,8),

        Book5("005","American Gods","Neil Gaiman",635,"Fantasy",4.11,"Harper Collins",2001,411);

        private String bookID;
        private String bookName;
        private String bookAuthor;
        private int bookPages;
        private String bookGenre;
        private double bookRating;
        private String bookPublisher;
        private int bookPublishedYear;
        private int bookPrice;
        private BookDetails(String bookID,String bookName,String bookAuthor,int bookPages,String bookGenre,double bookRating,String bookPublisher,int bookPublishedYear,int bookPrice){
            this.bookID = bookID;
            this.bookName = bookName;
            this.bookAuthor = bookAuthor;
            this.bookPages = bookPages;
            this.bookGenre = bookGenre;
            this.bookRating = bookRating;
            this.bookPublisher = bookPublisher;
            this.bookPublishedYear = bookPublishedYear;
            this.bookPrice = bookPrice;
        }
        public String getBookID() {

            return bookID;
        }
        public String getBookName(){

            return bookName;
        }
        public String getBookAuthor(){

            return bookAuthor;
        }
        public int getBookPages(){

            return bookPages;
        }
        public String getBookGenre(){

            return bookGenre;
        }
        public double getBookRating(){
            return bookRating;

        }
        public String getBookPublisher(){

            return bookPublisher;
        }
        public int getbookPublishedYear(){

            return bookPublishedYear;
        }
        public  int getBookPrice(){

            return bookPrice;
        }
        public static double getBookRent()
        {

            return 5.0;
        }
        public static BookDetails findByBookName(String bookName) {
            for (BookDetails book : BookDetails.values()) {
                if (book.getBookName().equals(bookName)) {
                    return book;
                }
            }
            return null;
        }
    }//enurm
    private String orderedBook;
    private LocalDate orderDate;
    private String orderID;
    private String transactionAmount;
    private String FirstName;
    private String LastName;
    private String EmailAddress;
    private String UserID;
    private int orderType;
    public BookStore(String firstName, String lastName, String email) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.EmailAddress = email;
    }
    public void OrderConfirmation(){


    }
    public void setUserID() {
        String nameCombination = (FirstName + LastName).toUpperCase();
        this.UserID = "TANLUS" + nameCombination.substring(0, Math.min(5, nameCombination.length()));
    }



    private void generateOrderID(LocalDate orderDate, String orderedBook) {
        String formattedOrderDate = orderDate.toString();
        String bookTitlePrefix = orderedBook.substring(0, Math.min(3, orderedBook.length())).toUpperCase();
        this.orderID =  "TANLOD" + formattedOrderDate + bookTitlePrefix;
    }



//    public BookStore() {
//    }
//    public BookStore(String firstName, String lastName, String emailAddress) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.emailAddress = emailAddress;
//    }
    public void EmailAddress(String firstName, String lastName, String emailAddress){
        this.EmailAddress = firstName + lastName + emailAddress;
//        return firstName + lastName + emailAddress;
    }

    public void displayBookDetails() {
        System.out.println("Book Details:");
        for (BookDetails book : BookDetails.values()) {
            System.out.println("Book ID: " + book.getBookID());
            System.out.println("Book Name: " + book.getBookName());
            System.out.println("Book Author: " + book.getBookAuthor());
            System.out.println("Book Pages: " + book.getBookPages());
            System.out.println("Book Genre: " + book.getBookGenre());
            System.out.println("Book Rating: " + book.getBookRating());
            System.out.println("Book Published Year: " + book.getbookPublishedYear());
            System.out.println("Book Publisher: " + book.getBookPublisher());
            System.out.println("Book Price: " + book.getBookPrice());
            System.out.println();
        }
    }

    public String getEmailAddress() {
        return
                EmailAddress;
    }

    public String getFirstName() {

        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getUserID() {
        return UserID;
    }


    public void searchBook(String bookID){
        boolean bookfound = false;
        for (BookDetails book : BookDetails.values()) {
            if (book.getBookID().equals(bookID)) {
                orderedBook = book.getBookName();
                this.orderDate = LocalDate.now();
                this.generateOrderID(orderDate,orderedBook);
                this.transactionAmount  = String.valueOf(BookDetails.findByBookName(orderedBook).bookPrice);
                bookfound = true;
                break;
            }
        }
//        System.out.println(bookfound);
//        System.out.println(!bookfound);
        if (!bookfound) {
            System.out.println("No book found with ID: " + bookID + ". Please try again.");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the book ID: ");
            String newBookID = scanner.nextLine();
            searchBook(newBookID);
        }
    }

    public void orderBook(int orderType) {

        ;
//        this.userID = userID;
//        this.emailAddress = emailAddress;
        this.orderType = orderType;
//         = transactionAmount;

//        System.out.println("Order ID:" +orderID);

    }

    public void orderConfirmation() {
        System.out.println("Order Confirmation:");
        System.out.println("Order ID: " + orderID);
        System.out.println("Order Date: " + orderDate);
        System.out.println("User ID: " + UserID);
        System.out.println("User contact: " + EmailAddress);
//        System.out.println("Ordered Book: " + orderedBook);
        System.out.println("Order Type: " + orderType);
        if (orderType==1) {
            System.out.println("Transaction Amount: €" + transactionAmount);
        } else if (orderType==2) {
            System.out.println("Rent Amount: €" + BookDetails.getBookRent());
        }
    }
}










