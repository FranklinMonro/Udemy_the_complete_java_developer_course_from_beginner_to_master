package udemy_java_methods;


import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FrancoGroenewald
 */
public class FunWith2DArrays {
    public static void main(String[] args) {
        // 2 row x 3 column
        int[][] my2DArry = new int[2][3];
        
        fill2DArray(my2DArry);
        
        print2DArray(my2DArry);
        
        twice2DArray(my2DArry);
        
        print2DArray(my2DArry);
    }
    
    public static void fill2DArray(int[][] twoDArr) {
        Random randomNumber = new Random();
        
        for(int i = 0; i < twoDArr.length; i++) {
            for(int j = 0; j < twoDArr[i].length; j++) {
                // randomize 0 through 99 (inclusive)
                // row i, column j
                twoDArr[i][j] = randomNumber.nextInt(100); // 0 ...... 99 (inclusive)             
            }
        }
    }
    
    public static void print2DArray(int[][] twoDArr) {
        for(int[] arr: twoDArr) {
            for(int num: arr) {
                System.out.print(" " + num );
            }
            System.out.println("");
        }
    }
    
    public static void twice2DArray(int [][] twoDArr) {
        for(int i = 0; i < twoDArr.length; i++) {
            for(int j = 0; j < twoDArr[i].length; j++) {
                twoDArr[i][j] *= 2;
            }
        }
    }
}
