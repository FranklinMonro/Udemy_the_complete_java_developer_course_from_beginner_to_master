
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Franco
 */
public class ArrayListFun {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        
        nameList.add("John");
        nameList.add("Kyle");
        nameList.add("Matthew");
        nameList.add("Amanda");
        nameList.add("Wendy");
        
        for(int i = 0; i < nameList.size(); i++) {
            System.out.println("On index: " + i + " the name is: " + nameList.get(i)  );
        }
        
        for(String name: nameList) {
            System.out.println("Name: " + name);
        }
    }
}
