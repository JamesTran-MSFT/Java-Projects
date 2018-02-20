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
 * 19 January 2018
 */
public class BookClubPoints {

    public static void main(String[] args) {

        int numberOfBooks;                  //number entered by user
        
        //Scanner for user input
        Scanner keyboard = new Scanner(System.in);
        
        //User input of number of books purchased.
        System.out.println("Enter how many books you purchased this month\n" +
                            "Please enter 1,2,3, or 4\n" +
                            "4 will stand for:\n4 OR more books since that is"
                             + " Max Points.");
        numberOfBooks = keyboard.nextInt();
        
        switch (numberOfBooks)
        {
            case 1:
                System.out.println("You purchased 1 book!\n"+
                        "which is equal to 5pts!!");
                break;
            case 2:
                System.out.println("You purchased 2 books!\n" +
                        "which is equal to 15pts!!");
                break;
            case 3:
                System.out.println("You purchased 3 books!\n" +
                        "which is equal to 30pts!!");
                break;
            case 4:
                System.out.println("You purchased 4 or more books!\n" +
                        "which is equal to 60pts!!");
                break;
            default:
                System.out.println("Please enter 1,2,3 OR 4. Thank you.");
                break;
        }
        
        
        
        
        
        
        
        
        
    }
    
}
