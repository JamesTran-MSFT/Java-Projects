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
 * @author James
 */
public class CelciusTemperatureTable {


    public static void main(String[] args) {
        double celcius;             //Celcius
        double fahrenheit;         //Fahrenheit
        double input;
        
        Scanner keyboard = new Scanner(System.in);
        
        //User input of Fahrenheit needed to convert
        System.out.println("Enter Fahrenheit temp you want to convert: ");
        fahrenheit = keyboard.nextDouble();
        
        
        celcius = getCelcius(fahrenheit);
        System.out.println("The temp you entered converted to Celcius is: ");
        System.out.printf("%.2f", celcius);
        System.out.println();
                                                            
        
        //Fahrenheit to Celcius Table
        System.out.println("Fahrenheit to Celcius Table: ");
        System.out.println("------------------------------");
        System.out.println("Fahrenheit " + "\t\t" + "Celcius" );
        
        double fahrenheitTemp;
        for(double celciusTemp = 0; celciusTemp < 20; celciusTemp++){
            fahrenheitTemp = (((double ) 9 / 5) * celciusTemp ) + 32;
            System.out.printf("\t%.1f\t\t%.1f\n", celciusTemp, fahrenheitTemp);
        }

}
    
    /*Used to convert Fahrenheit to Celcius
    @param user input to be converted
    @return Celcius
    */
    
    public static double getCelcius(double fahrenheit){
        double C;               //Celcius
        
        //Calculation ( C= 5/9 * (F - 32) )
        C = .55 * (fahrenheit - 32);
        return C;
    }

}
    

