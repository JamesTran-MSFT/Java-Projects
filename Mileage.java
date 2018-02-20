/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import java.util.Scanner;

/**
 *
 * @author James
 * 11 January 2018
 */
public class Mileage {

    public static void main(String[] args) {
        String name;    //To hold the users name
        double milesDrove;   //Miles driven on one tank of gas
        double amountOfGallons;     //Amount of Gallons in the tank
        double mpg;
        
        //Scanner object to read input of user
        Scanner keyboard = new Scanner(System.in);
        
        //Get the user's name
        System.out.println("Hello, what is your name?");
        name = keyboard.nextLine();
        
        //Get amount of miles drove on one tank
        System.out.println("In order to calculate your average MPG " +
                            "we need to know the amount of miles you drove " +
                            "in one tank.");
        milesDrove = keyboard.nextDouble();
        
        //Get amount of gallons in tank at the start
        System.out.println("Now we need to know how many gallons were " +
                            "in your tank at the start. OR the size of " +
                            "your tank in Gallons.");
        amountOfGallons = keyboard.nextDouble();
        
        
       //Calculation for avg Miles per Gallon 
        mpg = milesDrove / amountOfGallons ;
        
        System.out.println("Thank you for your cooperation " + name +
                           " your average gas mileage in MPG is " + mpg);
        
        
        
    }
    
}
