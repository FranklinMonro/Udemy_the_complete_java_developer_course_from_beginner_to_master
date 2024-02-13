/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy_java_methods;

/**
 *
 * @author FrancoGroenewald
 */
public class CountDown {
    public static void main(String[] args) {
        countDownFrom(10);
    }
    
    public static void countDownFrom(int num) {
        if(num >= 0) {
            System.out.println("num: " + num);
            countDownFrom(num - 1);
        }
    }
}
