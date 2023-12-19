/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.udemy_java_string_stringbuilder_class;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class NameParser {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your first name and last name: ");
        String names = keyboard.nextLine();
        
        int spaceIndex = names.indexOf(" ");
        
        String first = names.substring(0, spaceIndex);
        String last = names.substring(spaceIndex + 1);
        
        System.out.println("First name to upper: " + first.toUpperCase());
        System.out.println("Last name to lower: " + last.toLowerCase());
        
        // Solution
        String fullName;
        String firstName;
        String lastName;
        
        System.out.println("What is your full name?: ");
        fullName = keyboard.nextLine();
        
        int indexOfSpace = fullName.indexOf(" ");
        firstName = fullName.substring(0, indexOfSpace);
        lastName = fullName.substring(spaceIndex + 1);
        
        firstName = firstName.toUpperCase();
        lastName = lastName.toLowerCase();
        
        System.out.println("First name is: " + firstName);
        System.out.println("Last name is: " + lastName);
    }
}
