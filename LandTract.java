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
public class LandTract {
    private double tractLength;
    private double tractWidth;
    private double area;

public LandTract()
{
    tractLength = 0;
    tractWidth = 0;
    area = 0;
}
	
public LandTract(double length, double width)
{
    tractLength = length;
    tractWidth = width;
}

public double getLength(double length)
{
    return length;
}

public double getWidth(double width)
{
    return width;
}

public double getArea(double length, double width)
{
    return length * width;
}


public boolean equals(LandTract tract2)
{
    return this.area == tract2.area;
}

public String toString(int area)
{
    return "Area: " + area;
}




    public static void main(String[] args) {
double length;          
double width;        


 Scanner keyboard = new Scanner(System.in);


 System.out.print("Enter the length of Tract 1: ");
 length = keyboard.nextDouble();
                System.out.print("Enter the width of Tract 1: ");
 width = keyboard.nextDouble();


 LandTract tract1 = new LandTract(length, width);


 System.out.print("Enter the length of tract 2: ");
 length = keyboard.nextDouble();
                System.out.print("Enter the width of tract 2: ");
 width = keyboard.nextDouble();


 LandTract tract2 = new LandTract(length, width);


 System.out.println("\nTract 1 Area: " + tract1);
 System.out.println("Tract 2 Area: " + tract2 + "\n");

// Determine whether the two tracts are equal
 if (tract1.equals(tract2))
    System.out.println("The tracts are the same size");
 else
    System.out.println("The tracts are NOT the same size");



    }
    
}
