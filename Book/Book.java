
 package Book;
import java.util.ArrayList;

 public  class Book {
    // Attributes
    private String title;
    private String author;
    private String isbn;

    // Static collection of books
    private static ArrayList<Book> bookCollection = new ArrayList<>();

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    // Method to display book information
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println();
    }

    // Method to add a book to the collection
    public static void addBook(Book book) {
        bookCollection.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Method to remove a book from the collection by ISBN
    public static void removeBook(String isbn) {
        boolean removed = false;
        for (Book b : bookCollection) {
            if (b.getIsbn().equals(isbn)) {
                bookCollection.remove(b);
                System.out.println("Book removed: " + b.getTitle());
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    // Method to display all books in the collection
    public static void displayAllBooks() {
        System.out.println("\n=== Book Collection ===");
        if (bookCollection.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book b : bookCollection) {
                b.displayBookInfo();
            }
        }
    }
    
}
