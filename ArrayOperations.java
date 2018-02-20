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
public class ArrayOperations {

    
    public static void main(String[] args) {
        int[] testData = {10,20,30,40,50};      //Array initialized with data
        int lowest;                            //Lowest # in Array
        int highest;                          //Highest # in Array
        int total;                           //Total of all #'s in Array
        int average;                        //Average of all #'s in Array
        
        lowest = getLowest(testData);
        
        highest = getHighest(testData);
        
        total = getTotal(testData);
        
        average = getAverage(testData);

    }
    
    /* Method to get lowest number in array
    @param INT array for testData
    @return the lowest number in array
    */
    
    private static int getLowest(int[] testData){
        int lowest = testData[0];
        
        for(int i = 0; i < testData.length; i++){
            if (testData[i] < lowest) {
                lowest = testData[i];
            }   
        } System.out.println("The lowest # in the Array is: " + lowest);  
        return lowest;
        
}
    
    /*Method to get highest number in array
    @param INT array for test Data
    @return the highest number in array
    */
    
    private static int getHighest(int[] testData){
        int highest = testData[0];
        
        for(int i = 0; i < testData.length; i++){
            if(testData[i] > highest)
                highest = testData[i];
             } System.out.println("The highest # in the Array is: " + highest);
             return highest;
         }
    
    /*Method to get the total number in an Array
    @param INT array of test data
    @return the sum/Total of the whole array
    */
    
    private static int getTotal(int[] testData){
        int total = 0;
        
        for(int i = 0; i < testData.length; i++){
            total += testData[i];
        } System.out.println("The total of all #'s in the Array is: " + total);
        
      return total;  
    } 
    
    /*Method to retun average in an array
    @param INT array for test data
    @return the average of all #'s in an Array
    */
    
    private static int getAverage(int[] testData){
        int total = 0;
        int average;
        
        for(int i = 0; i < testData.length; i++){
            total += testData[i];
        }
        average = total / testData.length;
        
        System.out.println("The average of all numbers is: " + average);
            return average;
    }
    
}

