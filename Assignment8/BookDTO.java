package assignment2;


//1. Create Book DTO class with attributes like title, ISBN etc. Create appropriate instance variables, static variables and methods with appropriate access modifiers.
public class BookDTO {

    static String title;
    static String ISBN;
    static String author;
    static double price;
    static int publicationYear;


    public void displayBookDetails() {
        System.out.println("Title: Java The Complete Reference");
        System.out.println("ISBN: 978-1260440232");
        System.out.println("Author: Herbert Schildt");
        System.out.println("Price: $48.08");
        System.out.println("Publication Year: 2018");
    }

    public static void main(String[] args) {
        BookDTO book1 = new BookDTO();
        book1.displayBookDetails();
  

    }
}
