class Book {
    
    static String libraryName = "Central City Library";

    private final String isbn;


    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn; 
        this.title = title;
        this.author = author;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayDetails() {
        if (this instanceof Book) {   // instanceof check
            System.out.println("ISBN: " + isbn);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("------------------------");
        } else {
            System.out.println("Not a valid Book object!");
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book.displayLibraryName();

        Book book1 = new Book("ISBN001", "Java Programming", "James Gosling");
        Book book2 = new Book("ISBN002", "Effective Java", "Joshua Bloch");

        book1.displayDetails();
        book2.displayDetails();
    }
}
