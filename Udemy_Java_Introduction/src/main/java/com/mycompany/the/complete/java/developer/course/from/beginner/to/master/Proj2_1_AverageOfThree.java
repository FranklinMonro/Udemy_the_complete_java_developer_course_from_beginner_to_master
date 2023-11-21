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
public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        double thirdNumber;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please give first number between 0 - 100: ");
        
        firstNumber = keyboard.nextDouble();
        keyboard.nextLine();
        
        System.out.println("Please give second number between 0 - 100: ");
        
        secondNumber = keyboard.nextDouble();
        keyboard.nextLine();
        
        System.out.println("Please give third number between 0 - 100: ");
        
        thirdNumber = keyboard.nextDouble();
        keyboard.nextLine();
        
        double result = (firstNumber + secondNumber + thirdNumber) / 100;
        
        System.out.println("The average is: " + result);
        
        // Solution
        
        double num1;
        double num2;
        double num3;
        double average;
        
        System.out.println("Please enter three numbers");
        num1 = keyboard.nextDouble();
        num2 = keyboard.nextDouble();
        num3 = keyboard.nextDouble();
        keyboard.nextLine();
        
        average = (num1 + num2 + num3) / 3.0;
        
        System.out.println("Average is: " + average);
    }
            
}
