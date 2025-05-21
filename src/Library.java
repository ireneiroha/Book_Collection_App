import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> collection = new ArrayList<>();

    public void addBook(Book book) {
        collection.add(book);
        System.out.println("Book added: " + book);
    }

    public void removeBookByISBN(String isbn) {
        collection.removeIf(book -> book.getISBN().equals(isbn));
        System.out.println("Book with ISBN " + isbn + " removed.");
    }
    public void listBooks() {
        for (Book book : collection) {
            System.out.println(book);
        }
    }

}
