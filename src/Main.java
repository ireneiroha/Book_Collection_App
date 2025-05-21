public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book("The Java Programming Language", "Ken Arnold", "978-0134685991");
        Book b2 = new Book("Effective Java", "Joshua Bloch", "978-0134686097");

        library.addBook(b1);
        library.addBook(b2);
        System.out.println("\nAll books:");
        library.listBooks();

        library.removeBookByISBN("978-0134685991");

        System.out.println("\nAfter removal:");
        library.listBooks();
        }


}