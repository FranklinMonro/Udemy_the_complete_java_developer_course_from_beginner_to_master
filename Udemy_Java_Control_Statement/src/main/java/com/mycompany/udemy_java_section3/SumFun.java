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
public class SumFun {
    public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            
            double sum = 0;
            double input;
            System.out.println("Enter a non-negative integer");
            System.out.print("Or negatie to exit");
            input = keyboard.nextDouble();
            
            while (input > 0) {
                sum += input;
                System.out.println("Enter a non-negative integer");
                System.out.print("Or negatie to exit");
                input = keyboard.nextDouble();
            }
            
            System.out.println("The total sum is: " + sum);
            
            // Solution
            
            int sumSolution = 0;
            int inputSolution;
            
            // Priming read
            System.out.println("Enter non-negative to add to sum");
            System.out.print("Enter a negative to exit!");
            inputSolution = keyboard.nextInt();
            
            while(inputSolution > 0) {
                sumSolution += inputSolution;
                System.out.println("Enter non-negative to add to sum");
                System.out.print("Enter a negative to exit!");
                inputSolution = keyboard.nextInt();
            }
            
            System.out.println("Sum is: " + sumSolution);
    }
}
