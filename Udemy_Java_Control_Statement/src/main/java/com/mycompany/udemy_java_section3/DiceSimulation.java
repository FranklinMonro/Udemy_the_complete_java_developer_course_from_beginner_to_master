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
public class DiceSimulation {
    public static void main(String[] args) {
        Random random = new Random();
        int diceRoll;
        int count = 1;
        
        while(count <= 10){
            System.out.println("Dice roll number: " + count);
            diceRoll = random.nextInt(5) + 1;
            System.out.println("You have rolled: " + diceRoll);
            count++;
        }
        
        // Solution
        int diceVal;
        
        for(int i = 0; i < 10; i++) {
            diceVal = random.nextInt(6) + 1;
            System.out.println("Solution dice value: " + diceVal);
        }
    }
}
