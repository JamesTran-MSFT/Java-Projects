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
public class QuarterlySalesStats {

    public static void main(String[] args) {
      final int DIVS = 6; // Three divisions in the company
      final int QTRS = 4; // Four quarters
      double totalSales = 0.0;  // Accumulator
      double average = 0;
      double highest = 0;
      double lowest = 0;

      // Create an array to hold the sales for each
      // division, for each quarter.
      double[][] sales = new double[DIVS][QTRS];

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Display an introduction.
      System.out.println("This program will calculate the " +
                         "total sales of all the company's divisions.");
        System.out.println("Enter the following sales data: ");

      // Nested loops to fill the array with quarterly
      // sales figures for each division.
      for (int div = 0; div < DIVS; div++)
      {
         for (int qtr = 0; qtr < QTRS; qtr++)
         {
            System.out.printf("Division %d, Quarter %d: $",
                              (div + 1), (qtr + 1));
            sales[div][qtr] = keyboard.nextDouble();
         }
         System.out.println();   // Print blank line.
      }

      // Nested loops to add all the elements of the array.
      for (int div = 0; div < DIVS; div++)
      {
         for (int qtr = 0; qtr < QTRS; qtr++)
         {
            totalSales += sales[div][qtr];
            average = totalSales / sales[div][qtr];
         }
      }

      // Display the total sales.
      System.out.printf("Total company sales: $%,.2f\n",
                        totalSales);
        System.out.printf("Average of all sales: $%,.2f\n", average);
        
    for(int div = 0; div < DIVS; div++){
        for(int qtr = 0; qtr < QTRS; qtr++){
            highest = sales[0][0];
        if(sales[div][qtr] > highest){
            highest = sales[div][qtr];
        }    
        } 
    }System.out.println("The highest sales is: " + highest);
    
    for(int div = 0; div < DIVS; div++){
        for (int qtr = 0; qtr < QTRS; qtr++){
           lowest = sales[0][0];
           if(sales[div][qtr] < lowest)
               lowest = sales[div][qtr];
        }
    }System.out.println("The lowest sales is: " + lowest);
}
    
}