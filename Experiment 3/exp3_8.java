/* 8.	Write a program to design a class representing theinformation regarding digital library (books, tape: book & tape should be separate classes having the base class as media).
The class should have the functionality for adding new item, issuing, deposit etc. */

import java.util.ArrayList;

class Media {
    private String title;
    private String author;
    private boolean available;

    public Media(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true; // Initially available
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class Book extends Media {
    private int pages;

    public Book(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }
}

class Tape extends Media {
    private int duration; // Duration in minutes

    public Tape(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}

public class exp3_8 {
    public static void main(String[] args) {
        ArrayList<Media> library = new ArrayList<>();

        // Adding books and tapes to the library
        library.add(new Book("Can't Hurt Me", "David Goggins", 400));
        library.add(new Tape("Atomic Habits", "James Clear", 320));

        // Displaying available items in the library
        System.out.println("Available Items in the Library:");
        for (Media item : library) {
            if (item.isAvailable()) {
                if (item instanceof Book) {
                    Book book = (Book) item;
                    System.out.println("Book: " + book.getTitle() + " by " + book.getAuthor() + " (" + book.getPages() + " pages)");
                } else if (item instanceof Tape) {
                    Tape tape = (Tape) item;
                    System.out.println("Tape: " + tape.getTitle() + " by " + tape.getAuthor() + " (" + tape.getDuration() + " minutes)");
                }
            }
        }

        // Simulating issuing and depositing items
        Media book = library.get(0);
        book.setAvailable(false); // Book is issued
        System.out.println("Book '" + book.getTitle() + "' has been issued.");

        Media tape = library.get(1);
        tape.setAvailable(false); // Tape is issued
        System.out.println("Tape '" + tape.getTitle() + "' has been issued.");

        // Displaying updated availability
        System.out.println("\nUpdated Availability:");
        for (Media item : library) {
            System.out.println(item.getTitle() + ": " + (item.isAvailable() ? "Available" : "Not Available"));
        }

        // Simulating depositing
        book.setAvailable(true); // Book is deposited
        System.out.println("\nBook '" + book.getTitle() + "' has been deposited.");

        // Displaying updated availability
        System.out.println("\nUpdated Availability:");
        for (Media item : library) {
            System.out.println(item.getTitle() + ": " + (item.isAvailable() ? "Available" : "Not Available"));
        }
    }
}
