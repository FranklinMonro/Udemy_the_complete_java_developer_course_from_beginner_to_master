/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy_java_methods;

import java.util.ArrayList;

/**
 *
 * @author FrancoGroenewald
 */
public class Proj6_1_SumOfElements {
    
    public static void main(String[] args) {
        
        // Challenge
        double result = sumElements(createArrayList(0, 10, 20));
        System.out.println("Result: " + result);
        
        // Solution
        ArrayList<Integer> someList = new ArrayList<>();
        someList.add(10);
        someList.add(22);
        someList.add(55);
        someList.add(121);
        
        int sum = sumElement(someList);
        System.out.println("Sum: " + sum);
    }
    
    
    // Challenge
    private static ArrayList<Integer> createArrayList(int min, int max, int size) {
        ArrayList<Integer> numberArrayList = new ArrayList<>();
        
        int arraySize = size;
        int range = max - min + 1;
        for(int i = 0; i < arraySize; i++) {
            int randomNumber =(int)(Math.random() * range) + min; 
            numberArrayList.add(randomNumber);
        }
        
        return  numberArrayList;
    }
    
    private static double sumElements(ArrayList<Integer> numList) {
        double sumResult = 0;
        for (int num : numList) {
            sumResult += num;
        }
        return sumResult;
    }
    
    // Solution
    public static int sumElement(ArrayList<Integer> list) {
        int sum = 0;
        
        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
    
}
