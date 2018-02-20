/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author James Tran
 * 15 January 2018
 */
public class SortedNames {

    public static void main(String[] args) {

        String name1;
        String name2;
        String name3;
        
        String input;
        
        //Scanner for user input of first users name
        Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter the first users name.");
        name1 = keyboard.nextLine();
        
        //Input for second users name
        System.out.println("Enter the second users name.");
        name2 = keyboard.nextLine();
        
        //Input for third users names
        System.out.println("Enter the third users name.");
        name3 = keyboard.nextLine();
        

        System.out.println("The ordered names in Ascending" +
                            " order is as follows\n");
        
        //Statement comparing name1 to name 2
        if (name1.compareTo(name2) < 0) 
            System.out.printf("%s\n", name1);
        else if (name1.compareTo(name2) == 0)
            System.out.printf("%s\n%s\n", name1, name2);
        else if (name1.compareTo(name2) > 0)
            System.out.printf("%s\n", name2);
        
        //Statement comparing name2 to name1
        if (name2.compareTo(name1) < 0)
            System.out.printf("%s\n", name2);
        else if (name2.compareTo(name1) == 0)
            System.out.printf("%s\n%s\n", name1, name2);
        else if (name2.compareTo(name1) > 0)
            System.out.printf("%s\n", name1);
        
        //Statement comparing name3 to name 2
        if (name3.compareTo(name2) < 0)
            System.out.printf("%s\n", name3);
        else if (name3.compareTo(name2) == 0)
            System.out.printf("%s\n%s\n", name2, name3);
        else if (name3.compareTo(name2) > 0)
            System.out.printf("%s\n", name2);

 
    }
    
}
