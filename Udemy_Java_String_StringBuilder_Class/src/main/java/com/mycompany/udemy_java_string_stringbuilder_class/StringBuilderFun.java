/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.udemy_java_string_stringbuilder_class;

/**
 *
 * @author Franco
 */
public class StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("John Baugh");
        
        sb.append(" is awesome");
        
        System.out.println("SB, append: " + sb);
        
        sb.insert(5, "Phillip ");
        
        System.out.println("SB, insert: " + sb);
        
        sb.replace(22, 29, "amazing");
        
        System.out.println("SB, replace: " + sb);
        
        sb.delete(5, 13);
        
        System.out.println("SB, delete: " + sb);
        
        sb.replace(0, 4, "Dr.");
        
        System.out.println("SB, replace 2: " + sb);
    }
}
