package comPack.assingPack;

import javax.sound.midi.Soundbank;

class Book {
    private int bookId;
    private String bookName;
    private String bookAuthor;
    
   
    // Getters and Setters
    public int getBookId() {
        return bookId;
    }
    
    public void setBookId(int id) {
        this.bookId = id;
    }
    
    public String getBookName() {
        return bookName;
    }
    
    public void setBookName(String name) {
        this.bookName = name;
    }
    
    public String getBookAuthor() {
        return bookAuthor;
    }
    
    public void setBookAuthor(String author) {
        this.bookAuthor = author;
    }
    
    // Add a book to the library
    public void addBook(int id, String name, String author) {
        setBookId(id);
        setBookName(name);
        setBookAuthor(author);
    }
    
    
    // Display all the books in the library
    public void dispenseBook(String Name) {
        if(getBookName()==Name){
            System.out.println("\n ID: " + getBookId() + "\n Name: " + getBookName() + "\n Author: " + getBookAuthor());
        }else{
            System.out.println(" Book is Not Available");
        }
        
    }
}

public class LibraryBookManagementSystem {
    public static void main(String[] args) {
        Book b1 = new Book();
        
        // Add some books to the library
        b1.addBook(1, "Java", "Anirudh");
        
        // Display all the books in the library
        b1.dispenseBook("Java");
        System.out.println();
        b1.dispenseBook("Python");
    }
}

