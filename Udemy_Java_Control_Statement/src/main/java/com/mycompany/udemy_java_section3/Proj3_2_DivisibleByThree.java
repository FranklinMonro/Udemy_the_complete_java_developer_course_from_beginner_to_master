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
public class Proj3_2_DivisibleByThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int userNumber;
        System.out.println("Is number divisible by three");
        
        System.out.print("Please enter a number: ");
        userNumber = keyboard.nextInt();
        
        if(userNumber % 3 == 0) {
            System.out.println("The number " + userNumber + " is dvisible by three");
        }
        else {
            System.out.println("The number " + userNumber + " is NOT dvisible by three");
        }
        
        // Solution
        
        int input;
        
        System.out.print("Please enter your integer");
        input = keyboard.nextInt();
        
        if(input % 3 == 0) {
            System.out.println(input + " is divisible by 3");
        }
        else {
            System.out.println(input + " is NOT divisible by 3");
        }
    }
}
