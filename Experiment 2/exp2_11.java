/* 11.	 Design a Book class: Attributes: title, author, ISBN
Methods: getTitle(), getAuthor(), getISBN(), toString() (to print book details)
 */

 import java.util.Scanner;

class Book{
    String title;
    String author;
    String ISBN;

    Scanner sc=new Scanner(System.in);
    // this is constructor
    // public Book(String title, String author, String ISBN){
    //     this.title=title;
    //     this.author=author;
    //     thi s.ISBN=ISBN;
    // }
    public void getTitle(){
        System.out.println("Enter title of book:");
        title=sc.nextLine();
    }
    public void getAuthor(){
        System.out.println("Enter Author name of book:");
        author=sc.nextLine();
    }
    public void getISBN(){
        System.out.println("Enter ISBN of book:");
        ISBN=sc.nextLine();
    }

    @Override // not necessary to write 
    // toString() returns string
    public String toString() {
        return "-------Book Details-------" +
                "\nTitle: " + title +
                "\nAuthor: " + author +
                "\nISBN: " + ISBN;
    }

}
 public class exp2_11 {

    public static void main(String args[]){
        Book b1=new Book();
        b1.getTitle();
        b1.getAuthor();
        b1.getISBN();
        b1.toString();

        System.out.println(b1.toString());
    }
    
}
