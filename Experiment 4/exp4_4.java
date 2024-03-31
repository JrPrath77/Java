// error in returning book,dvd function .... switch case 3 and 4
/* 4.	Problem Statement: Implement an interface-based solution in Java to manage a library system.Create an interface called LibraryItem with the following methods:
void checkOut(): Marks the library item as checked out.
void checkIn(): Marks the library item as checked in.
boolean isAvailable(): Returns true if the library item is available for checkout, false otherwise.
Implement two classes that represent different types of library items: Book and DVD.
Both classes should implement the LibraryItem interface.
Each class should have appropriate instance variables and methods to represent the item's unique properties.
For example, the Book class can have instance variables like title, author, and ISBN, along with getters and setters.
Create a Library class that manages a collection of library items.
The Library class should have methods to add items to the library, remove items from the library, and search for items by title or author.
The library should also keep track of the items that are currently checked out.
Implement a LibraryApp class with a main method that demonstrates the usage of the library system.
The main method should create instances of books and DVDs, add them to the library, and perform various operations such as checking out and checking in items.
Display appropriate messages to indicate the success or failure of each operation.
Your task is to design and implement the classes and interfaces mentioned above, ensuring proper encapsulation and adherence to object-oriented principles. Use appropriate data structures and algorithms to efficiently manage the library system.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

interface LibraryItem {
  void checkOut();
  void checkIn();
  boolean isAvailable();
  String getTitle();
}

class Book implements LibraryItem {
    String title;
    String author;
    String ISBN;
    int price;
    boolean isAvailable = true; // Track availability status

    public Book(String title, String author, String ISBN, int price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void checkOut() {
        if (isAvailable) {
            System.out.println("Book \"" + title + "\" by " + author + " checked out successfully!");
            isAvailable = false;
        } else {
            System.out.println("Sorry, book \"" + title + "\" is currently unavailable.");
        }
    }

    @Override
    public void checkIn() {
        if (!isAvailable) {
            System.out.println("Book \"" + title + "\" by " + author + " checked in successfully!");
            isAvailable = true;
        } else {
            System.out.println("Book \"" + title + "\" by " + author + " is already available.");
        }
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }
}

class DVD implements LibraryItem {
    String title;
    String director;
    String genre;
    String language;
    String releaseDate;
    String duration;
    boolean isAvailable = true; // Track availability status

    public DVD(String title, String director, String genre, String language, String releaseDate, String duration) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.language = language;
        this.releaseDate = releaseDate;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getLanguage() {
        return language;
    }

    public String getDirector(){
        return director;
    }

    @Override
    public void checkOut() {
        if (isAvailable) {
            System.out.println("DVD \"" + title + "\" by " + director + " checked out successfully!");
            isAvailable = false;
        } else {
            System.out.println("Sorry, DVD \"" + title + "\" is currently unavailable.");
        }
    }

    @Override
    public void checkIn() {
        if (!isAvailable) {
            System.out.println("DVD \"" + title + "\" by " + director + " checked in successfully!");
            isAvailable = true;
        } else {
            System.out.println("DVD \"" + title + "\" by " + director + " is already available.");
        }
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }
}


class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<DVD> dvds = new ArrayList<>();
    private HashMap<String, LibraryItem> checkedOutItems = new HashMap<>();

    // ... existing methods ...

    // Added methods for managing checked out items
    public void displayCheckedOutItems() {
        // Display both books and DVDs
        displayCheckedOutBooks();
        displayCheckedOutDVDs();
    }

    public void displayCheckedOutBooks() {
        System.out.println("Books currently checked out:");
        for (LibraryItem item : checkedOutItems.values()) {
            if (item instanceof Book) {
                Book book = (Book) item;
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    public void displayCheckedOutDVDs() {
        System.out.println("DVDs currently checked out:");
        for (LibraryItem item : checkedOutItems.values()) {
            if (item instanceof DVD) {
                DVD dvd = (DVD) item;
                System.out.println(dvd.getTitle() + " by " + dvd.getDirector());
            }
        }
    }

    public Book findCheckedOutBookByTitle(String title) {
        for (LibraryItem item : checkedOutItems.values()) {
            if (item instanceof Book && item.getTitle().equalsIgnoreCase(title)) {
                return (Book) item;
            }
        }
        return null;
    }

    public DVD findCheckedOutDVDByTitle(String title) {
        for (LibraryItem item : checkedOutItems.values()) {
            if (item instanceof DVD && item.getTitle().equalsIgnoreCase(title)) {
                return (DVD) item;
            }
        }
        return null;
    }

    public void removeBook(Book book) {
        checkedOutItems.remove(book.getTitle());
        books.remove(book);
    }

    public void removeDVD(DVD dvd) {
        checkedOutItems.remove(dvd.getTitle());
        dvds.remove(dvd);
    }

    public void addBook(Book book) {
        books.add(book);
      }
    
      public void addDVD(DVD dvd) {
        dvds.add(dvd);
      }
}


class exp4_4 {
    public static void main(String[] args) {
        Library library = new Library();  // Create an instance of the Library
        Scanner sc = new Scanner(System.in);
       
        Book[] books = new Book[5];   // Changed the array size to 5
        books[0] = new Book("Can't Hurt Me", "David Goggins", "9780062857218", 500);
        books[1] = new Book("Mrutyunjaya", "Shivaji Sawant", "9782253059177", 857);
        books[2] = new Book("Shyamchi Aai", "Sane Guruji", "9788184565186", 292);
        books[3] = new Book("How to Read a Book", "Mortimer J. Adler", "9780671212094", 426);
        books[4] = new Book("Yugandhar", "Shivaji Sawant", "9788184987984", 650);

//Similar changes to store DVDs in correct manner
DVD[] dvds = new DVD[4];
        dvds[0] = new DVD("Atomic Habits", "James Clear", "Motivational", "English", "16 October 2018", "5 Hour 35 Minute");
        dvds[1] = new DVD("The Ultimate Zig Ziglar Library", "Zig Ziglar", "Self-Help", "English", "25 April 2016", "13 hour 55 min");
        dvds[2] = new DVD("Shrimad Bhagavad Gita", "Om Swami", "Spirituality", "English", "14 October 2021", "Duration not Available");
        dvds[3] = new DVD("Dopamine Detox", "Joshua Alexander", "Self-Improvement", "English", "26 August 2021", "1 hour 5 min");

        int choice;
        do {
            System.out.println("\n\nWhat do you want?");
            System.out.println("1. Get Book\n2. Get DVD\n3. Return Book\n4. Return DVD\n5. Exit");
            choice = sc.nextInt();
            sc.nextLine();  // Consume newline character after integer input

            switch (choice) {
                case 1:
                    // Display available books
                    System.out.println("Available Books:");
                    for (Book book : books) {
                        if (book != null && book.isAvailable()) {
                            System.out.println(book.getTitle() + " by " + book.getAuthor());
                        }
                    }

                    // Take input for the book the user wants
                    System.out.print("Enter the title of the book you want: ");
                    String bookTitle = sc.nextLine();

                    // Find the selected book in the array
                    Book selectedBook = null;
                    for (Book book : books) {
                        if (book != null && book.getTitle().equalsIgnoreCase(bookTitle)) {
                            selectedBook = book;
                            break;
                        }
                    }

                    if (selectedBook != null && selectedBook.isAvailable()) {
                        selectedBook.checkOut();
                        library.addBook(selectedBook);  // Add the book to the library
                    } else {
                        System.out.println("Book is unavailable or not found.");
                    }
                    break;
                case 2:
                    // Display available DVDs
                    System.out.println("Available DVDs:");
                    for (DVD dvd : dvds) {
                        if (dvd != null && dvd.isAvailable()) {
                            System.out.println(dvd.getTitle() + " by " + dvd.getDirector());
                        }
                    }

                    // Take input for the DVD the user wants
                    System.out.print("Enter the title of the DVD you want: ");
                    String dvdTitle = sc.nextLine();

                    // Find the selected DVD in the array
                    DVD selectedDVD = null;
                    for (DVD dvd : dvds) {
                        if (dvd != null && dvd.getTitle().equalsIgnoreCase(dvdTitle)) {
                            selectedDVD = dvd;
                            break;
                        }
                    }

                    if (selectedDVD != null && selectedDVD.isAvailable()) {
                        selectedDVD.checkOut();
                        library.addDVD(selectedDVD);  // Add the DVD to the library
                    } else {
                        System.out.println("DVD is unavailable or not found.");
                    }
                    break;

                    // Code for menu and user input
                    
                    case 3:
                        // Return a book to the library
                        System.out.println("Books currently checked out:");
                        library.displayCheckedOutBooks();  // Call the method on the library instance
                        System.out.print("Enter the title of the book to return: ");
                        String returnBookTitle = sc.nextLine();
                        Book returnBook = library.findCheckedOutBookByTitle(returnBookTitle);  // Call the method on the library instance
                        if (returnBook != null) {
                            returnBook.checkIn();
                            library.removeBook(returnBook);  // Call the method on the library instance
                        } else {
                            System.out.println("Book not found in the checked out items.");
                        }
                        break;
                    case 4:
                        // Return a DVD to the library
                        System.out.println("DVDs currently checked out:");
                        library.displayCheckedOutDVDs();  // Call the method on the library instance
                        System.out.print("Enter the title of the DVD to return: ");
                        String returnDVDTitle = sc.nextLine();
                        DVD returnDVD = library.findCheckedOutDVDByTitle(returnDVDTitle);  // Call the method on the library instance
                        if (returnDVD != null) {
                            returnDVD.checkIn();
                            library.removeDVD(returnDVD);  // Call the method on the library instance
                        } else {
                            System.out.println("DVD not found in the checked out items.");
                        }
                        break;
                    
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Enter valid choice");
            }
        }while(choice!=5);
    }
}


