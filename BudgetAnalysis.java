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
public class BudgetAnalysis {

    public static void main(String[] args) {

int budget = 0;                         //User entered budget
int monthlyTotal = 0;                  //Running monthly total
int expenses = 0, underBudget,            //Expenses and +/- budget
    overBudget;
String userInput;                       //User input for expenses

    //User input of monthly budget
    userInput = JOptionPane.showInputDialog("Enter your monthly Budget");
    budget = Integer.parseInt(userInput);
    
    //Do while loop to loop while user enters a number > 0
    int number = 1;
    do
    {
    userInput = JOptionPane.showInputDialog("Enter your recorded expenses:"  
                                                        + "\nEnter 0 to stop.");
                                                        
    expenses = Integer.parseInt(userInput);
    number++;
    //Calculations
    monthlyTotal += expenses;
    underBudget = budget - monthlyTotal;
    overBudget = monthlyTotal - budget;

    } while (expenses != 0);
    
    //If statement to display monthly total & how user did in month
    if (monthlyTotal < budget)
    {
    System.out.println("You did awesome this month! \nYour overall total was "
                                + monthlyTotal + " you were under budget by: " 
                                                                + underBudget);
                                                                
    } else System.out.println("I think we need to re-evaluate your spending. " +
                            "\nYour monthly total was " + monthlyTotal +
                                " \nYou were over budget by: " + overBudget);

    }
}
