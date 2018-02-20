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
public class AreaClass {
    
 


 /*Method should calculate the area of a circle
    @param Radius
    @return area of a circle
*/
public static double getArea(double radius)
{
    return Math.PI * radius;
}

/*Method should calculate the area of a rectangle
@param length and width
@return area of rectangle
*/

public static double getArea(int width, int length)
{
    return width * length;
}
    

/*Method should calculate the area of a cyclinder
@param radius and height
@return area of a cylinder
*/

public static double getArea(double r, double height)
{
    return Math.PI * ((r*r) * height);
}
    
    public static void main(String[] args) {

    //Object to access AreaClass
    AreaClass area = new AreaClass();
    
    //Area of a circle
        System.out.println("The area of a cirlce with a radius of 20 is: ");
        System.out.printf("%.2f" , area.getArea(20));
        
    //Area of a rectangle
        System.out.println("\nThe area of a rectangle with a length of 10" +
                            " and width of 20 is: ");
        System.out.printf("%.2f", area.getArea(10,20));
        
    //Area of a cylinder
        System.out.println("\nThe area of a cylinder with a radius of 10" +
                            " and a height of 30 is: ");
        System.out.printf("%.2f", area.getArea(10,30));


    }
    
}
