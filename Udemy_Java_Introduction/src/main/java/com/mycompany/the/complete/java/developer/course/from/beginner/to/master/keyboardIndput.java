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
public class keyboardIndput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String city;
        int age;
        
        System.out.println("What is your name?: ");
        name = keyboard.nextLine();
        
        System.out.println("What is your age?: ");
        age = keyboard.nextInt();
        keyboard.nextLine(); // Consume the newline
        
        System.out.println("What city do you live in?: ");
        city = keyboard.nextLine();
        
        System.out.println("Hello, " + name);
        System.out.println("your age is " + age);
        System.out.println("you live in " + city);
        
        int getNumber;
        String yourCity;
        System.out.println("Give a number between 0 - 100");
        getNumber = keyboard.nextInt();
        keyboard.nextLine();
        
        getNumber *= 2;
        System.out.println("Twice your number is: " + getNumber);
        
        System.out.println("What city do you live in?: ");
        yourCity = keyboard.nextLine();
        
        System.out.println("The city you live in is: " + yourCity);
    }
}
