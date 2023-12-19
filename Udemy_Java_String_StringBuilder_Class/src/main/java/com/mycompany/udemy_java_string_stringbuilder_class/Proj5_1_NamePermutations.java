/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.udemy_java_string_stringbuilder_class;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class Proj5_1_NamePermutations {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        ArrayList<String> fullNamesList = new ArrayList<>();
        ArrayList<String> firstNameList = new ArrayList<>();
        ArrayList<String> lastNameList = new ArrayList<>();
        
        for(int i = 0; i < 5; i++) {
            System.out.print("Please enter full names " + (i + 1) + " : ");
            fullNamesList.add(keyboard.nextLine());
        }

        for(int i = 0; i < fullNamesList.size(); i++) {
            String fullName = fullNamesList.get(i);
            int spaceIndex = fullName.indexOf(" ");
            String first = fullName.substring(0, spaceIndex);
            String last = fullName.substring(spaceIndex + 1);
            firstNameList.add(first);
            lastNameList.add(last);
        }

        for(int i = 0; i < firstNameList.size(); i++) {
            for(int j = 0; j < lastNameList.size(); j++) {
                System.out.println("Mutated names: " + firstNameList.get(i) + " " + lastNameList.get(j));
            }
        }
        
        // Solutions
        
        ArrayList<String> fullNames = new ArrayList<>();
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();
        
        String fullName;
        String firstName;
        String lastName;
        int indexOfSpace;
        
        final int NUM_NAMES = 5;
        
        for(int i = 0; i < NUM_NAMES; i++) {
            System.out.print("Please enter name " + i + "\t");
            fullName = keyboard.nextLine();
            indexOfSpace = fullName.indexOf(" ");
            firstName = fullName.substring(0, indexOfSpace);
            lastName = fullName.substring(indexOfSpace + 1);
            
            firstNames.add(firstName);
            lastNames.add(lastName);
        }
        
        for(int i = 0; i < firstNames.size(); i++) {
            for(int j = 0; j < lastNames.size(); j++) {
                System.out.print(firstNames.get(i) + " ");
                System.out.println(lastNames.get(j));
            }
        }
    }
}
