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
 * 19 January 2018
 */
public class BankCharges {

    public static void main(String[] args) {
     
        final double bankFee = 10;          //Banks monthly fee
        double checkFee;                   //Check fees
        double checksUsed;                //Checks written
        double total10;                   //.10 fee
        double total8;                  //.08 fee
        double total6;                 //.06 fee
        double total4;                //.04 fee
        
        String input;                     //Get customers input
        String name;                     //Getting customers name
        
        name = JOptionPane.showInputDialog("Hello, what is your name?");

        //Asking user how many checks they wrote this month.
        input = JOptionPane.showInputDialog("How many checks did you write"
                                            + " this month?");
        checksUsed = Double.parseDouble(input);
        
        //Check fee of .10 for less than 20 checks
        total10 = bankFee + (checksUsed * .10);
        
        //Check fee of .08 for 20-39 checks    
        total8 = bankFee + (checksUsed * .08);
        
        //Check fee of .06 for 40-59 checks 
        total6 = bankFee + (checksUsed * .06);
        
        //Check fee of .04 for more than 60 checks
        total4 = bankFee + (checksUsed * .04);
        
        if (checksUsed < 20)
            JOptionPane.showMessageDialog(null, name + " your base fee is\n" +
                        bankFee + " dollars" + "\nplus a check fee of $.10ea" +
                        "\ntotaling\n" + total10 + " dollars.");
        else if (checksUsed >= 20 && checksUsed <= 39)
            JOptionPane.showMessageDialog(null, name + " your base fee is\n" +
                        bankFee + " dollars" + "\nplus a check fee of $.08ea" +
                        "\ntotaling\n" + total8 + " dollars.");
        else if (checksUsed >= 40 && checksUsed <= 59)
            JOptionPane.showMessageDialog(null, name + " your base fee is\n" +
                        bankFee + " dollars" + "\nplus a check fee of $.06ea" +
                        "\ntotaling\n" + total6 + " dollars.");
        else if (checksUsed > 60)
            JOptionPane.showMessageDialog(null, name + " your base fee is\n" +
                        bankFee + " dollars" + "\nplus a check fee of $.04ea" +
                        "\ntotaling\n" + total4 + " dollars.");

            System.exit(0);
    }
    
}
