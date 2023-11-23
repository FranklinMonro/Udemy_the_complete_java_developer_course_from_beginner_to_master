/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.udemy_java_section3;

/**
 *
 * @author Franco
 */
public class ContinueBreak {
    public static void main(String[] args) {
        int count = 0;
        
        while(count < 10) {
            if (count == 5) {
                count++;
                continue;
            }
            System.out.print("Count continue: " + count + "\t");
            count++;
        }
        
        while(count < 10) {
            if (count == 5) {
                count++;
                break;
            }
            System.out.print("Count break: " + count + "\t");
            count++;
        }
    }
}
