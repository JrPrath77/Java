package libraryManagement;

import java.util.*;

public class Utils {
    public static List<Book> searchBooksByTitle(Library library, String title) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : library.getBooks()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public static double calculateLateFees(int daysLate) {
        // Logic to calculate late fees based on the number of days late
        return daysLate * 0.50; // Assuming $0.50 per day late fee
    }

    public static void Showbooks() {
        List<Book> allBooks = Library.getBooks();
        for (Book book : allBooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthor().getAuthor());
        }
    }
}
