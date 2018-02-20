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
public class FreezingAndBoilingPoints {

    private double temperature;     //Temperature
    
    
public FreezingAndBoilingPoints(double t)
{
    temperature = t;
}

public FreezingAndBoilingPoints()
{
    temperature = 0;
}

/*Get the Temperature
@return Temperature
*/
public double getTemperature()
{
    return temperature;
}

/*Method checks if temperature entered is freezing
@param boolean
@return Temperature if Ethyl is freezing
*/
public boolean isEthylFreezing()
{
    System.out.println("Ethyl will freeze at -173");
    if(temperature <= -173){
        return true;
    }else return false;

}

/*Method should check if temperature is boiling
@param boolean
@return Temperature if Ethyl is boiling
*/
public boolean isEthylBoiling()
{
    System.out.println("Ethyl will Boil at 172");
    if(temperature >=172){
        return true;
    }else 
    {
        return false;
    } 
    
}

/*Method that checks if oxygen is freezing
@param boolean
@return Temperature if oxygen is freezing
*/
  
public boolean isOxygenFreezing()
{
    System.out.println("Oxygen will freeze at -362");
    if(temperature <= -362) {
        return true;
    }else
    {
        return false;
    }
}

/*Method that checks if oxygen is boiling
@param boolean
@return Temperature if oxygen is boiling
*/

public boolean isOxygenBoiling()
{
    System.out.println("Oxygen will Boil at -306");
    if(temperature >= -306){
        return true;
    }else
    {
        return false;
    }
}

/*Method that checks if water is freezing
@param boolean
@return Temperature if water is freezing
*/

public boolean isWaterFreezing()
{
    System.out.println("Water will freeze at 32");
    if(temperature <=32){
        return true;
    }else
    {
        return false;
    }
}

/*Method that checks if water is boiling
@param boolean
@return Temperature if water is boiling
*/

public boolean isWaterBoiling()
{
    System.out.println("Water will Boil at 212");
    if(temperature >=212){
        return true;
    }else return false;
}


    public static void main(String[] args) {

// Create a Scanner object for user input.
    Scanner keyboard = new Scanner(System.in);
    
        System.out.println("Enter Temperature you want to Freeze or Boil: ");
	double temperature = keyboard.nextDouble();
        
//Creating an object to reference a seprate instance of a class
FreezingAndBoilingPoints point = new FreezingAndBoilingPoints(temperature);
    

//If statements for executing certain methods in other class
    if(temperature <=-173){
        point.isEthylFreezing();
    }
    
    if(temperature <= -362){
        point.isOxygenFreezing();
    }
    
    if(temperature <= 32){
        point.isWaterFreezing();
    }
    
    if(temperature >=172){
        point.isEthylBoiling();
    }
    
    if(temperature <= -306){
        point.isOxygenBoiling();
    }
    
    if(temperature >= 212){
        point.isWaterBoiling();
    }


    

    }
    
}
