/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.udemy_java_section3;

    import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class Proj3_1_LearningPackagesOfTheMonth {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Welcome to Learning Stars");
        
        int package1 = 10;
        int package1Includes = 2;
        int package1Additional = 6;
        int package2 = 10;
        int package2Includes = 4;
        int package2Additional = 6;
        int package3 = 10;
        int package3Includes = 6;
        int package3Additional = 6;
        
        System.out.println("Learning Package 1\n" + "\t- $" + package1 
                + " , includes " + package1Includes + " courses per month\n" +
                "\t- Each additional course is $" + package1Additional);
        System.out.println("Learning Package 1\n" + "\t- $" + package2 
                + " , includes " + package2Includes + " courses per month\n" +
                "\t- Each additional course is $" + package2Additional);
        System.out.println("Learning Package 1\n" + "\t- $" + package3 
                + " , includes " + package3Includes + " courses per month\n" +
                "\t- Each additional course is $" + package3Additional);
        
        System.out.print("Please select which package you want(1/2/3): ");
        int packageSelected = keyboard.nextInt();
        
        System.out.print("Please select how many courses do you want: ");
        int courseSelected = keyboard.nextInt();
        
        double totalOwe = 0;
        
        if (packageSelected == 1) {
            if (courseSelected > package1Includes) {
                totalOwe = (courseSelected - package1Includes) * package1Additional  + package1;
            }
            else {
                totalOwe = package1;
            }
        }
        else if (packageSelected == 2) {
            if (courseSelected > package2Includes) {
                totalOwe = (courseSelected - package2Includes) * package2Additional  + package2;
            }
            else {
                totalOwe = package2;
            }
        }
        else if (packageSelected == 3) {
            if (courseSelected > package3Includes) {
                totalOwe = (courseSelected - package3Includes) * package3Additional  + package3;
            }
            else {
                totalOwe = package3;
            }
        }
        else {
            System.out.println("You did not make a valid selection");
        }
        
        System.out.println("Your bill is: $" + totalOwe);
        
        
        // Solution
        
        int packageNumber;
        int howManyCourses;
        int baseCost;
        int costPerCourse;
        int numIncluded;
        int totalCost;

        System.out.print("Which of the packages do you want? 1, 2 or 3");
        packageNumber = keyboard.nextInt();
        System.out.print("How many courses did you enroll in this month?");
        
        howManyCourses = keyboard.nextInt();
        
        if(packageNumber == 1) {
            baseCost = 10;
            costPerCourse = 6;
            numIncluded = 2;
        }
        else if(packageNumber == 2) {
            baseCost = 12;
            costPerCourse = 4;
            numIncluded = 4;
        }
        else {
            baseCost = 15;
            costPerCourse = 3;
            numIncluded = 6;
        }
        
        // Calaculate total cost
        
        if(howManyCourses > numIncluded) {
            totalCost = baseCost + (howManyCourses - numIncluded) * costPerCourse;
        }
        else {
            totalCost = baseCost;
        }
        
        System.out.println("Your cost is $" + totalCost);
    }
}

