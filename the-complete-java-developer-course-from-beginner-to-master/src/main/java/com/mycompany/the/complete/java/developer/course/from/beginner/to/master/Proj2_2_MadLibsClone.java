/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.the.complete.java.developer.course.from.beginner.to.master;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class Proj2_2_MadLibsClone {
    public static void main(String[] args) {
        System.out.println("Please complete the following story");
        System.out.println("There once was a ADJECTIVE1, girl named GIRLS_NAME,\n"
                + "who was a ADJECTIVE2OCCUPATION1 in the kingdom of PLACE.\n "
                + "She loved to wear CLOTHING and to HOBBY. She wanted to marry\n "
                + "the ADJECTIVE3OCCUPATION2 named BOYS_NAME but her father, King\n "
                + "MANS_NAME forbid her from seeing him.");
        
        Scanner keyboard = new Scanner(System.in);
        String adjective1;
        String girlsName;
        String adjective2Occupation1;
        String place;
        String clothing;
        String hobby;
        String adjective3Occupation2;
        String boysName;
        String mansName;
        
        System.out.println("Please entet word for, ADJECTIVE1:");
        adjective1 = keyboard.nextLine();
        
        System.out.println("Please entet word for, GIRLS_NAME:");
        girlsName = keyboard.nextLine();
        
        System.out.println("Please entet word for, ADJECTIVE2OCCUPATION1:");
        adjective2Occupation1 = keyboard.nextLine();
        
        System.out.println("Please entet word for, PLACE:");
        place = keyboard.nextLine();
        
        System.out.println("Please entet word for, CLOTHING:");
        clothing = keyboard.nextLine();
        
        System.out.println("Please entet word for, HOBBY:");
        hobby = keyboard.nextLine();
        
        System.out.println("Please entet word for, ADJECTIVE3OCCUPATION2:");
        adjective3Occupation2 = keyboard.nextLine();
        
        System.out.println("Please entet word for, BOYS_NAME:");
        boysName = keyboard.nextLine();
        
        System.out.println("Please entet word for, MANS_NAME:");
        mansName = keyboard.nextLine();
        
        System.out.println("There once was a " + adjective1 + ", girl named " + girlsName + ",\n"
                + "who was a " + adjective2Occupation1 + " in the kingdom of " + place + ".\n "
                + "She loved to wear " + clothing + " and to " + hobby + ". She wanted to marry\n "
                + "the " + adjective3Occupation2 + " named " + boysName + " but her father, King\n "
                + "" + mansName + " forbid her from seeing him.");
        
        
        // Solution
        String adjective1Solution;
        String girlsNameSolution;
        String adjective2Solution;
        String placeNameSolution;
        String clothingSolution;
        String hobbySolution;
        String occupation2Solution;
        String boysNameSolution;
        String mansNameSolution;
        
        System.out.print("Enter an adjective:\t");
        adjective1Solution = keyboard.nextLine();
        
        System.out.print("Enter an girl's name:\t");
        girlsNameSolution = keyboard.nextLine();
        
        System.out.print("Enter another adjective:\t");
        adjective2Solution = keyboard.nextLine();
        
        
        System.out.print("Enter the name of a place:\t");
        placeNameSolution = keyboard.nextLine();
        
        System.out.print("Enter the name piece of clothing:\t");
        clothingSolution = keyboard.nextLine();
        
        System.out.print("Enter the name of a hobby:\t");
        hobbySolution = keyboard.nextLine();
        
        
        System.out.print("Enter another occupation:\t");
        occupation2Solution = keyboard.nextLine();
        
        System.out.print("Enter an boy's name:\t");
        boysNameSolution = keyboard.nextLine();
        
        System.out.print("Enter an man's name:\t");
        mansNameSolution = keyboard.nextLine();
        
        System.out.println("There once was a " + adjective1Solution + ", girl named " + girlsNameSolution + ",\n"
                + "who was a " + adjective2Solution + " in the kingdom of " + placeNameSolution + ".\n "
                + "She loved to wear " + clothingSolution + " and to " + hobbySolution + ". She wanted to marry\n "
                + "the " + occupation2Solution + " named " + boysNameSolution + " but her father, King\n "
                + "" + mansNameSolution + " forbid her from seeing him.");
    }
}
