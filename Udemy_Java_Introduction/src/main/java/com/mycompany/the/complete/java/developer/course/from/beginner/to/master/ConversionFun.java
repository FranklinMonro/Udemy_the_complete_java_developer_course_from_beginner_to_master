/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.the.complete.java.developer.course.from.beginner.to.master;

/**
 *
 * @author Franco
 */
public class ConversionFun {
    public static void main(String[] args) {
        double myDouble = 3.14;
        float myFloat = 3.14F; // Narrowing / lossy conversion
        double yourDouble = myFloat; // Widening / lossless conversion
        System.out.println("myDouble: " + myDouble);
        System.out.println("myFloat: " + myFloat);
        System.out.println("yourDouble: " + yourDouble);
    } 
}
