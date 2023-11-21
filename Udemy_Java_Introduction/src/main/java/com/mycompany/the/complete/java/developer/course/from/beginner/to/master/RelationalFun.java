/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.the.complete.java.developer.course.from.beginner.to.master;

/**
 *
 * @author Franco
 */
public class RelationalFun {
    public static void main(String[] args) {
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 37;
        int yourAge = 20;
        int bobsAge = 20;
        
        System.out.println("myBool is: " + myBool);
        System.out.println("yourBool is: " + yourBool);
        System.out.println("myAge is: " + myAge);
        System.out.println("yourAge is: " + yourAge);
        System.out.println("bobsAge is: " + bobsAge);
        
        // Relational operations
        boolean ageComparison = myAge > yourAge;
        System.out.println("myAge > yourAge: " + ageComparison);
        
        ageComparison = yourAge > bobsAge;
        System.out.println("yourAge > bobsAge: " + ageComparison);
        
        ageComparison = yourAge == bobsAge;
        System.out.println("yourAge == bobsAge: " + ageComparison);
        
        String myName = "John";
        String yourName = "John";
        
        boolean nameComparison = myName.equals(yourName);
        System.out.println("Do names match?: " + nameComparison);
        
        int myCurrentAge = 44;
        boolean currentAgeComparison = myCurrentAge >= 21;
        System.out.println("myCurrentAge >= 21: " + currentAgeComparison);
    }
}
