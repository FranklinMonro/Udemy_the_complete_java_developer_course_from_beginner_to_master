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
public class RepetitionFun {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        int input;
        
        // Priming read
        System.out.println("Enter a non-negative integer");
        System.out.print("Or negatie to exit");
        input = keyboard.nextInt();
        
        while(input >= 0) {
            System.out.println("Input: " + input);
            
            System.out.println("Enter a non-negative integer");
            System.out.print("Or negatie to exit");
            input = keyboard.nextInt();
        }
        
        System.out.println("Done!");
        
        int count = 0;
        
        while(count <= 10) {
            System.out.println("Count: " + count);
            count++;
        }
        
        int doCount = 0;
        
        do {
            System.out.println("doCount: " + doCount);
            doCount++;
        }
        while(doCount < 10);
        
        for(int forCount = 0; forCount < 10; forCount++) {
            System.out.println("forCount: " + forCount);
        }
        
        
    }
}
