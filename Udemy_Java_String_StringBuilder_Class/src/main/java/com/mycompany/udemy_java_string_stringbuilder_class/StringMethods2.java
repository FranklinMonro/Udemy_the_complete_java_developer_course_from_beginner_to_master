/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.udemy_java_string_stringbuilder_class;

/**
 *
 * @author Franco
 */
public class StringMethods2 {
    public static void main(String[] args) {
        String myName = "John Baugh";
        
        String upper = myName.toUpperCase();
        String lower = myName.toLowerCase();
        
        int whereIsB = myName.indexOf("B");
        
        String lastName = myName.substring(5);
        
        System.out.println("myName: " + myName);
        System.out.println("myName, upper: " + upper);
        System.out.println("myName, lower: " + lower);
        System.out.println("myName, whereIsB: " + whereIsB);
        System.out.println("myName, lastName: " + lastName);
    }
}
