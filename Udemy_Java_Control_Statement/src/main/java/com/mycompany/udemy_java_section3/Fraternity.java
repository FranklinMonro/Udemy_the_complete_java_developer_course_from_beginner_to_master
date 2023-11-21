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
public class Fraternity {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int age;
        char gender;
        
        System.out.print("What is your age?");
        age = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.print("What is your gender (M/F)?");
        gender = keyboard.nextLine().toUpperCase().charAt(0);
        
        if (age >= 19 && gender == 'M') {
            System.out.println("You can join the Male Faternity");
        }
        else if (age >= 19 && gender == 'F') {
            System.out.println("You can join the Female Faternity");
        }
        else {
            System.out.println("Sorry you are not old endought to join a Faternity");
        }
        
        // Solution
        int ageSolution;
        char genderSolution;
        
        System.out.print("Enter you age?:\t");
        ageSolution = keyboard.nextInt();
        
        System.out.print("Enter your gender:\t");
        genderSolution = keyboard.next().charAt(0);
        
        if (ageSolution >= 19 && genderSolution == 'M') {
            System.out.println("You can join the fraternity.");
        }
        else {
            System.out.println("Sorry, you cannot join the fraternity.");
        }
    }
}
