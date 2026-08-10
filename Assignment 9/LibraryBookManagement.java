class Book {
    // ISBN is final, so it cannot be changed once assigned
    private final String isbn;
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Display book details
    public void displayBookDetails() {
        System.out.println("Book ISBN : " + isbn);
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Price     : ₹" + price);
    }
}

public class LibraryBookManagement {
    public static void main(String[] args) {

        // Creating a book object
        Book book = new Book(
            "978-0135166307",
            "Effective Java",
            "Joshua Bloch",
            850.00
        );

        // Display book details
        book.displayBookDetails();
    }
}