/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.udemy_java_section3;

/**
 *
 * @author Franco
 */
public class ControlStatementsInto {
    public static void main(String[] args) {
        int age = 15;
        System.out.println("age: " + age);
        
        if(age >= 16) {
            System.out.println("You can drive!");
        }
        else {
            System.out.println("You cannot drive yet!");
        }
        
        System.out.println(""); // Add some newline space
        
        for(int i = 1; i <= age; i++) {
            System.out.println("Happy birthday: " + i);
        }
    }
}
