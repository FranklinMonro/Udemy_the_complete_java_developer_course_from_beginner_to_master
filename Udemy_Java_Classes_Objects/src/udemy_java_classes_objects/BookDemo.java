/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy_java_classes_objects;

/**
 *
 * @author FrancoGroenewald
 */
public class BookDemo {
    public static void main(String[] args) {
        Book gameOfThrones = new Book("George Martin", "Game of Thrones", "Fantasy", 864);
        
        Book mathBook = new Book("James Stewart", "Calculus", "Math", 1392);
        
        Book javaBook = new Book("Joel Murach", "Murach's Java Programming", "Programming", 800);
        
        printBookDetailsA(gameOfThrones);
        printBookDetailsA(mathBook);
        printBookDetailsA(javaBook);
        
        gameOfThrones.printBookDetails();
        mathBook.printBookDetails();
        javaBook.printBookDetails();
        
    }
    
    public static void printBookDetailsA(Book book) {
        System.out.println("Method in main");
        System.out.println("The book " + book.getTitle() + " is written by " +
                book.getAuthor() + " and is in the genre of " + book.getGenre() + 
                " and is " + book.getNumPages() + " pages long.\n");
    }
}
