/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.the.complete.java.developer.course.from.beginner.to.master;

/**
 *
 * @author Franco
 */
public class logicalFun {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean isWarm = true;
        
        boolean combined = isRaining && isWarm;
        
        System.out.println("Is it raining and warm: " + combined);
        
        combined = isRaining || isWarm;
        
        System.out.println("Is it raining OR warm?: " + combined);
        
        combined = !isRaining;
        
        System.out.println("Is it not raining outside?: " + combined);
    }
}
