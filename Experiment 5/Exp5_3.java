/* 2. Library Management (Organization and Access Control):
•	Design classes for Book, Author, and Library.
•	Create a package named libraryManagement.
•	Place the Book, Author, and Library classes within this package.
•	Within the libraryManagement package, define a class named Utils with helper methods like searchBooksByTitle or calculateLateFees.
•	Mark the Utils class methods as protected to restrict direct access from outside the package. Other classes within libraryManagement can utilize these methods, promoting modularity and controlled access
 */
import libraryManagement.*;
import java.util.*;

public class Exp5_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String bookName;
        Library library = Library.getInstance(); // Get instance of Library
        Book book1 = new Book("The Lord of the Rings", new Author("J.R.R. Tolkien"));
        Book book2 = new Book("Can't Hurt Me", new Author("David Goggins"));

        library.addBook(book1); // Add book1 to library
        library.addBook(book2); // Add book2 to library

        int choice;
        do {
            System.out.print("\nEnter Choice");
            System.out.println("\n1.Add Book\n2.Search Books By Title\n3.Calculate Late Fees\n4.Show All Books\n5.Exit");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter Name of Book:");
                    bookName = sc.nextLine();
                    System.out.println("Enter Author Name:");
                    String bookAuthor = sc.nextLine();
                    System.out.println("Enter Page Numbers:");
                    int pageNumbers = sc.nextInt();
                    Author author = new Author(bookAuthor);
                    Book newBook = new Book(bookName, author, pageNumbers);
                    library.addBook(newBook); // Add the new book to the library
                    break;

                case 2:
                    System.out.println("Enter Book name:");
                    bookName = sc.nextLine();
                    List<Book> searchResult = Utils.searchBooksByTitle(library, bookName);
                    for (Book book : searchResult) {
                        System.out.println(book.getTitle() + " by " + book.getAuthor().getAuthor());
                    }
                    break;

                case 3:
                    System.out.println("Enter Late days:");
                    int lateDays = sc.nextInt();
                    double lateFees = Utils.calculateLateFees(lateDays);
                    System.out.println("Late Fees: $" + lateFees);
                    break;

                case 4:
                    Utils.Showbooks();
                    break;

                case 5:
                    System.out.println("Exiting....");
                    break;
            }
        } while (choice != 5);
    }
}
