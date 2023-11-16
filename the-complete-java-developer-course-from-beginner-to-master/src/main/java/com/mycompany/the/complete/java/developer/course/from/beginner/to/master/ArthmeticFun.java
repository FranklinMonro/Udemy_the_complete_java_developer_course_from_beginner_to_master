/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.the.complete.java.developer.course.from.beginner.to.master;

/**
 *
 * @author Franco
 */
public class ArthmeticFun {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        
        // e.g., BINARY operator
        int result = a + b;
        int difference = a- b;
        int product = a * b;
        int quotient = b / a;
        int remainder = b % a;
        
        System.out.println("Result is: " + result);
        System.out.println("Difference is: " + difference);
        System.out.println("Product is: " + product);
        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);
        
        result += 20; // result = result + 20
        System.out.println("Result is now: " + result);
        
        // e.g., UNARY operators
        result++;
        System.out.println("result++ " + result);
        
        result--;
        System.out.println("result-- " + result);
        
        ++result;
        System.out.println("++result " + result);
        
        --result;
        System.out.println("--result " + result);
        
        product *= 2; // product = product * 2
        System.out.println("Final value of product is: " + product);
    }
}
