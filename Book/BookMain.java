
import java.util.ArrayList;
package Book;

public class BookMain {
    public static void main(String[] args) {
        // Create book objects
        Book book1 = new Book("Harry Potter", "J.K. Rowling", "12345");
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", "67890");

        // Add books to the collection
        addBook(book1);
        addBook(book2);

        // Display all books
        displayAllBooks();

        // Remove one book
        removeBook("12345");

        // Display updated collection
        displayAllBooks();
    }
}

