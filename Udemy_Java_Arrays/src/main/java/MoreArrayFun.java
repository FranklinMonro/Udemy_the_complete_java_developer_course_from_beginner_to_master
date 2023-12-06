/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Franco
 */
public class MoreArrayFun {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }
        
        for(int num: myArray) {
            System.out.println("num is: " + num);
        }
    }
}
