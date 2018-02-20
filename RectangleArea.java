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
 */
public class RectangleArea {

    public static void main(String[] args) {
        double length,    // The rectangle's length
        width,           // The rectangle's width
        area;             // The rectangle's area
   
      // Get the rectangle's length from the user.
      length = getLength();
   
      // Get the rectangle's width from the user.
      width = getWidth();

      // Get the rectangle's area.
      area = getArea(length, width);

      // Display the rectangle data.
      displayData(length, width, area);

    }
    
    /*Used to get length
    @param User entry of length
    @return length
    */
    
    public static double getLength(){
    Scanner keyboard = new Scanner(System.in);
        double length;
        System.out.println("Enter the length of the Rectangle");
        length = keyboard.nextDouble();
        
        return length;
    }
    
    /*Used to get Width
    @param User entry of Width
    @return width
    */
    
    public static double getWidth(){
       Scanner keyboard = new Scanner(System.in);
        double width;
        System.out.println("Enter the width of the Rectangle");
        width = keyboard.nextDouble();
        return width;
    }
    
    /*Used to calculate area of rectangle
    @param double length and width 
    @retun area
    */
    
    public static double getArea(double length, double width){
        double area;
        
        area = length * width;
        
        return area;
    }
    
    /*Display information of rectangle
    @param length, width, & area
    @return all values
    */
    
    public static void displayData(double length, double width, double area){
        System.out.println("The length you entered was: " + length);
        System.out.println("-------------------------------------");
        System.out.println("The width you entered was: " + width);
        System.out.println("------------------------------------");
        System.out.println("The calculated area is: " + area);
    }
}
