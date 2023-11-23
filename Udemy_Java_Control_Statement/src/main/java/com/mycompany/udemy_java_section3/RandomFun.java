/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.udemy_java_section3;

import java.util.Random;

/**
 *
 * @author Franco
 */
public class RandomFun {
    public static void main(String[] args) {
        Random random = new Random();
        int myRandomNumber;
        
        myRandomNumber = random.nextInt();
        System.out.println("Random number: \t" + myRandomNumber);
        
        myRandomNumber = random.nextInt(1000); // 0 - 999
        System.out.println("Random number, range 0 - 999: \t" + myRandomNumber);
        
        // Shifting
        myRandomNumber = random.nextInt(1000) + 1; // 1 - 1000
        System.out.println("Random number, range 1 - 1000(shifting): \t" + myRandomNumber);
    }
}
