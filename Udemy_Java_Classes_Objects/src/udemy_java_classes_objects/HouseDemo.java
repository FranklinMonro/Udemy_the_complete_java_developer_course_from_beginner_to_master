/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy_java_classes_objects;

/**
 *
 * @author FrancoGroenewald
 */
public class HouseDemo {
    public static void main(String[] args) {
        House myHouse = new House();
        House yourHouse = new House();
        
        myHouse.setNumStories(2);
        myHouse.setNumWindows(6);
        myHouse.setColor("red");
        
        yourHouse.setNumStories(3);
        yourHouse.setNumWindows(10);
        yourHouse.setColor("blue");
        
        System.out.println("My house color is " + myHouse.getColor() +
                " and has " + myHouse.getNumStories() + " stories and " +
                myHouse.getNumWindows() + " windows.\n");
        
        System.out.println("Your house color is " + yourHouse.getColor() +
                " and has " + yourHouse.getNumStories() + " stories and " +
                yourHouse.getNumWindows() + " windows.\n");
        
        House thatHouse = new House(5, 25, "green");
        
        System.out.println("That house color is " + thatHouse.getColor() +
                " and has " + thatHouse.getNumStories() + " stories and " +
                thatHouse.getNumWindows() + " windows.\n");
        
        printHouseData(myHouse);
        printHouseData(yourHouse);
        printHouseData(thatHouse);
        
    }
    
    public static void printHouseData(House house) {
        System.out.println("The house is " + house.getColor() + 
                " and has " + house.getNumStories() + " stoires and " +
                house.getNumWindows() + " windows.\n");
    }
}
