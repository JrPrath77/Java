package libraryManagement;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static ArrayList<Book> books = new ArrayList<>();

    private Library() {
    }

    public static void addBook(Book book) {
        books.add(book);
    }

    public static List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public static Library getInstance() {
        return new Library();
    }
}
