/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy_java_classes_objects;

/**
 *
 * @author FrancoGroenewald
 */
public class Book {
    private String author;
    private String title;
    private String genre;
    private int numPages;
    
    public Book(String author, String title, String genre, int numPages) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.numPages = numPages;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public int getNumPages() {
        return  numPages;
    }
    
    public void printBookDetails() {
        System.out.println("Method in class");
        System.out.println("The book " + title + " is written by " +
                author + " and is in the genre of " + genre + 
                " and is " + numPages + " pages long.\n");
    }
}
