/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy_java_methods;

/**
 *
 * @author FrancoGroenewald
 */
public class MethodCalls {
    public static void main(String[] args) {
      doSomething();
    }
    
    public static void doSomething() {
        System.out.println("doSomething");
        
        int result = getSomveValue();
        System.out.println("getSomveValue, result: " + result);
    }
    
    public static int getSomveValue() {
        return 150;
    }
}
