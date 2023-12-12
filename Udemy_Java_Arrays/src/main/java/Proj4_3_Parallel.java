
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Franco
 */
public class Proj4_3_Parallel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
         int[] ageList = new int[5];
         String[] nameList = new String[5];
         
         for(int i = 0; i < ageList.length; i++) {
             System.out.print("Please enter name: ");
             nameList[i] = keyboard.nextLine();
             System.out.print("Please enter age for " + nameList[i] + ": ");
             ageList[i] = keyboard.nextInt();
             keyboard.nextLine();
         }
         
         for(int i = 0; i < ageList.length; i++) {
             System.out.println(nameList[i] + " is " + ageList[i] + " years old");
         }
         
         // Solution
         ArrayList<String> names = new ArrayList<>();
         ArrayList<Integer> ages = new ArrayList<>();
         
         String name;
         int age;
         
         for(int i = 0; i < 5; i++) {
             System.out.print("Enter a name:\t");
             name = keyboard.nextLine();
             System.out.print("Enter a age:\t");
             age = keyboard.nextInt();
             keyboard.nextLine();
             
             names.add(name);
             ages.add(age);
         }
         
         for(int i = 0; i < names.size(); i++) {
             System.out.println(names.get(i) + " is " + ages.get(i) + " years old");
         }
    }
}
