
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Franco
 */
public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<Integer> myAl = new ArrayList<>();
        
        myAl.add(10);
        myAl.add(8);
        
        for(int i = 0; i < myAl.size(); i++) {
            System.out.println("print integer: " + myAl.get(i));
        }
        
        String someValue = "450";
        System.out.println("someValue: " + someValue);
        int numerValue = Integer.parseInt(someValue);
        numerValue += 10;
        System.out.println("numerValue: " + numerValue);
        
        String stringPi = "3.14159";
        double doublePi = Double.parseDouble(stringPi);
        
        System.out.println("Double Pi: " + doublePi);
    }
}
