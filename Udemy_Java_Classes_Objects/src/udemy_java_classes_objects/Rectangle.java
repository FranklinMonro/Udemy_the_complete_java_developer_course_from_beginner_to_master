/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy_java_classes_objects;

/**
 *
 * @author FrancoGroenewald
 */
public class Rectangle {
    private double length;
    private double width;
    
    private static int numRectangles;
    
    public Rectangle() {
        this(1.0, 1.0);
    }
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        
        numRectangles++;
    }
    
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double area() {
        return length * width;
    }
    
    public double permiter() {
        return 2 * length + 2 * width;
    }
    
    public static int getNumRectangles() {
        return  numRectangles;
    }
}
