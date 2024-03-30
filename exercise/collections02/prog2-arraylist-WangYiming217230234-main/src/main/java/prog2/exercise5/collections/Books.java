package prog2.exercise5.collections;

public enum Books {
    Carrie("001", "Carrie", "Stephen King", 272, "Horror", 3.98, 1974, "Wings", 14),
    Firm("002", "The Firm", "Robin Waterfield / John Grisham", 448, "Thriller", 4.01, 1991, "Addison Wesley Publishing Company", 25),
    Slaughterhouse("003", "Slaughterhouse-Five", "Kurt Vonnegut Jr", 275, "Sci-Fi", 4.1, 1969, "Dial Press", 18),
    Gatsby("004", "The Great Gatsby", "F. Scott Fitzgerald", 188, "Classic", 3.91, 1925, "Scribner", 8),
    Gods("005", "American Gods", "Neil Gaiman", 635, "Fantasy", 4.11, 2001, "Harper Collins", 11);

    public double getBookRent() {
        return bookRent;
    }
}
