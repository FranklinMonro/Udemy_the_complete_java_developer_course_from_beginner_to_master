/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.udemy_java_string_stringbuilder_class;

/**
 *
 * @author Franco
 */
public class StringMethods1 {
    public static void main(String[] args) {
        String name = "John Baugh";
        String name2 = "John Baugh";
        String name3 = "Rob Percival";
        String myName = "Franco Groenewald";
        
        for(int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
        
        System.out.println();
        
        if(name.equals(name2)) {
            System.out.println("Names are equal");
        }
        else {
            System.out.println("Names are NOT equal");
        }
        
        if(name.compareTo(name3) > 0) {
            System.out.println("name > name3");
        }
        else {
            System.out.println("name <= name3");
        }
        
        if(myName.compareTo(name3) > 0) {
            System.out.println("myName > name3");
        }
        else {
            System.out.println("myName <= name3");
        }
    }
}
