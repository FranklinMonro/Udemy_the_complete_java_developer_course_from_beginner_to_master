/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.udemy_java_section3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class Proj3_3_GuesTheNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int userNumber;
        
        System.out.print("Guess a number between 0-100");
        userNumber = keyboard.nextInt();
        
        while(userNumber != randomNumber) {
            if (userNumber > randomNumber) {
                System.out.println("Your guess is too hight");
            }
            else if (userNumber < randomNumber) {
                System.out.println("Your guess is too low");
            }
            else if (userNumber < 1 || userNumber > 100) {
                System.out.println("Your guess is out of range");
            } 
            else {
                System.out.println("Guess again!");
            }
            System.out.print("Guess a number between 0-100");
            userNumber = keyboard.nextInt();
            numberOfTries++;
        }
        
        System.out.println("You guess correctly, it only took you: " + numberOfTries);
        
        // Solution
        
        int ourGuess;
        int computerNumber;
        int guessCount = 0;
        boolean guessedNumber = false;
        computerNumber = random.nextInt(100) + 1;
        
        while(!guessedNumber) {
            System.out.print("Enter your integer guess");
            ourGuess = keyboard.nextInt();
            guessCount++;
            
            if(ourGuess >= 1 && ourGuess <= 100) {
                if(ourGuess == computerNumber) {
                    System.out.println("Congratulations! You guessed the number in" + guessCount);
                    guessedNumber = true;
                }
                else if(ourGuess > computerNumber) {
                    System.out.println("Your guess was too hight!");
                }
                else {
                    System.out.println("Your guess was too low!");
                }
            }
            else {
                System.out.println("That was a wasted guess! you must pick a number between 1 and 100, inclusive!");
            }
        }
    }
}
