class Book {
    String title;
    int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Author extends Book {
    String name;
    String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // calling superclass constructor
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
    }
}

public class Library{
    public static void main(String[] args) {
        Author a1 = new Author("Java Programming", 2021, "James Gosling", "Father of Java");
        a1.displayInfo();
    }
}
