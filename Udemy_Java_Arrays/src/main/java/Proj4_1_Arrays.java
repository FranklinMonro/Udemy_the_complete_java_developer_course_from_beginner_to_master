
import java.util.Scanner;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Franco
 */
public class Proj4_1_Arrays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] userArrayList = new int[5];
        int countAsIndex = 0;
        
        while (countAsIndex < 5) {
            System.out.print("Please enter a number: ");
            userArrayList[countAsIndex] = keyboard.nextInt();
            countAsIndex++;
        }
        
        System.out.println("Your array list is: " + userArrayList);
        
        for(int num: userArrayList) {
            num *= 2;
            System.out.println("num * 2: " + num);
        }
        
        // Solution
        int[] someValues = new int[5];
        
        for(int i = 0; i < someValues.length; i++) {
            System.out.print("enter an interger:\t");
            someValues[i] = keyboard.nextInt();
        }
        
        for(int i = 0; i < someValues.length; i++) {
            int result = someValues[i] * 2;
            System.out.println("result is: " + result);
        }
    }
}
