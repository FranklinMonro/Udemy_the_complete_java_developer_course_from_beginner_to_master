/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy_java_classes_objects;

/**
 *
 * @author FrancoGroenewald
 */
public class House {
    private int numStories;
    private int numWindows;
    private String color;
    
    // no-arg constructor
    public House() {
        numStories = 1;
        numWindows = 4;
        color = "gray";
    }
    
    // parametrized constructor
    public House(int numStories, int numWindows, String color) {
        this.numStories = numStories;
        this.numWindows = numWindows;
        this.color = color;
    }
            
    public int getNumStories() {
        return numStories;
    }
    
    public void setNumStories(int numStories) {
        this.numStories = numStories;
    }
    
    public int getNumWindows() {
        return numWindows;
    }
    
    public void setNumWindows(int numWindows) {
        this.numWindows = numWindows;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
}
