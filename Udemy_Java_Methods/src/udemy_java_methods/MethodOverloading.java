/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy_java_methods;

/**
 *
 * @author FrancoGroenewald
 */
public class MethodOverloading {
    public static void main(String[] args) {
        int result = getResult(5);
        System.out.println("Result 1: " + result);
        
        result = getResult(5,4);
        System.out.println("Result 2: " + result);
        
        result = getResult(5,"12");
        System.out.println("Result 3: " + result);
        
//        result = Integer.parseInt(getResult("5", "10"));
//        System.out.println("Result 4: " + result);

        System.out.println("getResult: " + getResult("Franco", "Groenewald"));
    }
    
    public static int getResult(int num) {
        return num *= 2;
    }
    
    public static int getResult(int num1, int num2) {
        return num1 * num2;
    }
    
    public static int getResult(int num1, String value) {
        return num1 * Integer.parseInt(value);
    }
    
    // challenge
//    public static String getResult(String value1, String value2) {
//        return value1 + value2;
//    }
    
    // solution
    public static String getResult(String str1, String str2) {
        return str1 + " " + str2;
    }
}
