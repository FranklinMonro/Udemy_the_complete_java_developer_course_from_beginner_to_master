
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Franco
 */
public class Proj4_2_ArrayLists {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Double> userArrayList = new ArrayList<>();
        
        System.out.print("Enter integer (enter negative number to exit)");
        double userInput = keyboard.nextDouble();
        userArrayList.add(userInput);
        
        while(userInput > 0) {
            System.out.print("Enter integer (enter negative number to exit)");
            userInput = keyboard.nextDouble();
            userArrayList.add(userInput);
        }
        
        Collections.reverse(userArrayList);
        
        for(double num: userArrayList) {
            System.out.println("Print array list entries in reverse, num: " + num);
        }
        
        // Solution
        ArrayList<Double> myList = new ArrayList<>();
        double input;
        
        System.out.print("Enter 0 or more to put in the list or -1 to exit");
        input = keyboard.nextDouble();
        
        while(input >= 0) {
            myList.add(input);
            System.out.print("Enter 0 or more to put in the list or -1 to exit");
            input = keyboard.nextDouble();
        }
        
        for(int i = myList.size() -1 ; i >= 0; i-- ) {
            System.out.println("Print in reverse: " + myList.get(i));
        }
    }
}
