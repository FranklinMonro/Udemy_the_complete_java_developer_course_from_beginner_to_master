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
public class SelectionFun {
    public static void main(String[] args) {
        int age;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Pub and Grille.");
        
        System.out.print("Please enter your age: ");
        age = keyboard.nextInt();
        
        if(age >= 21) {
            System.out.println("Do you want a beer?");
        } 
        else if(age >= 16) {
            System.out.println("Here have a Coke!");
            System.out.println("At least you can drive!");
        }
        else {
            System.out.println("Do you want a Coke?");
        }
        
        System.out.println("Thanks for coming to the Pub and Grille!");
    }
}
