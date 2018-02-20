/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import javax.swing.JOptionPane;

/**
 *
 * @author James Tran
 * // 18 January 2018
 */
public class BodyMassIndex {

    public static void main(String[] args) {

        double weight;              //Get the users Weight.
        double height;             //Get the users Height.
        double BMI;               //Calculating BMI.
        
        String input;
        String name;             //Getting users name.
        
        //Dialog box for user input.
        name = JOptionPane.showInputDialog("Hello, what is your name? ");
        
        
        //Getting users Weight.
        input = JOptionPane.showInputDialog("What is your current " +
                                            "bodyweight in pounds? ");
        weight = Double.parseDouble(input);
        
        
        //Getting users Height.
        input = JOptionPane.showInputDialog ("What is your height in inches? ");
        height = Double.parseDouble(input);
        
        
        /*Equation for BMI is, 
        *BMI = Weight * 703 / Height^2
        */
        
        BMI = (weight * 703) / (height * height);
        
        //UnderWeight Message
        if (BMI < 18.5)
            JOptionPane.showMessageDialog(null, "Thank you for your input " +
                                        name + " your current BMI is\n" + BMI +
                                        " \nwhich is Under Weight.");
        //Optimal Message 
        else if (BMI >= 18.5 && BMI <= 25)
            JOptionPane.showMessageDialog(null, "Thank you for your input " + 
                                        name + " your current BMI is\n" + BMI +
                                        " \nwhich is Optimal.");
        
        //OverWeight Message
        else if (BMI >= 25)
            JOptionPane.showConfirmDialog(null, "Thank you for your input " +
                                        name + " your current BMI is\n" + BMI +
                                        " \nwhich is Over Weight."); 
    }
    
}
