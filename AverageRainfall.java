/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import java.util.*;

/**
 *
 * @author James Tran
 * 23 January 2018
 */
public class AverageRainfall {


    public static void main(String[] args) 
    {
      int numYears,           // Number of years data collected
          numMonths,         // Number of months data collected
          score,            // Recording inches per month
          months,          // Calculate number of years into months
          inches,          //Calculates average rainfall per month
          total;          // Accumulator for inches per month
      double average;    // Average of rainfall for entire timeline

      // Create a Scanner object for userinput.
      Scanner keyboard = new Scanner(System.in);

      // Get the number of Years
      System.out.print("How many years of data do you have? ");
      numYears = keyboard.nextInt();
      months = 12 * numYears;

      // Get the number of Months.
      System.out.print("How many months of data? ");
      numMonths = keyboard.nextInt();
      //numMonths = numMonths + months(12 * years entered) e.g. 12*1yr = 12mo
      numMonths = numMonths + months;

      // Process all the months
      for (int x = 1; x <= numYears; x++)
      {
         total = 0; // Set the total to zero.
         inches = 0; // Set inches to zero.

         // Get the inches recorded per month.
         System.out.println("Recorded RainFall " );
         System.out.println("--------------------");
         for (int month = 1; month <= numMonths; month++)
         {
            System.out.print("Enter inches recorded for month " + month + ": ");
            score = keyboard.nextInt();
            total += score;  // Add score(inches) to total.
            
        //Calculating number of inches inputted divided by number of months
            inches = total;
         }

         // Calculate and display the months calculated, total & average.
         average = total / numMonths;
          System.out.print("The total numbers of months calculated: " 
                            + numMonths + "\n\n");
          
         System.out.printf("The total rainfall recorded is  %d.inches\n\n", +
                           inches);
         
         
         System.out.printf("Average rainfall per month %.1f. inches\n\n", +
                            average);
      }
        
        System.exit(0);
        }
        
    }
    
