package libraryManagement;

public class Book {
    String title;
    private Author author;
    private int numberOfPages;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, Author author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }
}
