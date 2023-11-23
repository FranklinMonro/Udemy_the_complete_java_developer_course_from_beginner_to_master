/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.udemy_java_section3;

/**
 *
 * @author Franco
 */
public class EvenOnly {
    public static void main(String[] args) {
        int count = 0;
        
        while(count < 20){
            if(count % 2 == 1) {
                count++;
                continue;
            }
            System.out.print("Count continue: " + count + "\t");
            count++;
        }
        
        // Solution
        
        int countSolution = 0;
        
        while(countSolution < 10) {
            
            if(countSolution % 2 != 0) {
                count++;
                continue;
            }
            System.out.println(count);
            count++;
        }
    }
}
