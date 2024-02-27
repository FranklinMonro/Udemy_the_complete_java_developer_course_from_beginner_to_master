/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy_java_classes_objects;

/**
 *
 * @author FrancoGroenewald
 */
public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 10);
        
        System.out.println(Rectangle.getNumRectangles());
        
        Rectangle r3;
        
        System.out.println("After r3 declared: " + Rectangle.getNumRectangles());
        
        r3 = new Rectangle(2.5, 4);
        
        System.out.println("After r3 instantaited: " + Rectangle.getNumRectangles());
        
        System.out.println("r1 Area: " + r1.area());
        System.out.println("r2 Area: " + r2.area());
        System.out.println("r3 Area: " + r3.area());
        
        System.out.println("Perimeter r1: " + r1.permiter());
        System.out.println("Perimeter r2: " + r2.permiter());
        System.out.println("Perimeter r3: " + r3.permiter());
    }
}
