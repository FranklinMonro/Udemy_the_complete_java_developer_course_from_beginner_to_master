/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy_java_methods;

/**
 *
 * @author FrancoGroenewald
 */
public class MethodsDemo {
    public static void main(String[] args) {
        printHello();
        printNumber(77);
        int result = giveMe10();
        System.out.println("Result give me 10: " + result);
        
        result = addThese(giveMe10(), 20);
        System.out.println("Result add these: " + result);
        
        double squareResult = squareNumber(20);
        System.out.println("Number squared: " + squareResult);
        
        System.out.println("Call square function in print: " + squareNumber(7.5));
    }
    
    // void, paramterless method
    public static void printHello() {
        System.out.println("Hello there!!");
    }
    
    // void, paramterized
    public static void printNumber(int a) {
        System.out.println("The number is: " + a);
    }
    
    // value-returning, parameterless
    public static int giveMe10() {
        return 10;
    }
    
    // value-returning, paramterized
    public static int addThese(int num1, int num2) {
        return  num1 + num2;
    }
    
    // Challenge
    public static double squareNumber(double number) {
        return number * number;
    }
    
}
