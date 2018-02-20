/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author James Tran
 * 18 January 2018
 */
public class TestScoresNGrades {

    public static void main(String[] args) {

        int testScore1;                 //First test score
        int testScore2;                //Second test score
        int testScore3;               //Third test score
        int Average;                 //Average of all test scores
        
        String input;
        
        //Message box for First Test Score // testScore1
        input = JOptionPane.showInputDialog("Enter your first test score.");
                testScore1 = Integer.parseInt(input);
                
        //Message box for Second Test Score // testScore2
        input = JOptionPane.showInputDialog("Enter your second test score.");
                testScore2 = Integer.parseInt(input);
                
        //Message box for Third Test Score// testScore3
        input = JOptionPane.showInputDialog("Enter your third test score.");
                testScore3 = Integer.parseInt(input);
        
        //Average calculation
        Average = (testScore1 + testScore2 + testScore3) / 3;
        
        //Displaying grade
        if (Average < 60)
                JOptionPane.showMessageDialog(null, "Your average test score" +
                                    " was\n" + Average + " \nwhich is an F.");
        else if (Average < 70)
                JOptionPane.showMessageDialog(null, "Your average test score" +
                                    " was\n" + Average + "\nwhich is a D.");
        else if (Average < 80)
                JOptionPane.showMessageDialog(null, "Your average test score" +
                                    " was\n" + Average + "\nwhich is a C.");
        else if (Average < 90)
                JOptionPane.showMessageDialog(null, "Your average test score" +
                                    " was\n" + Average + "\nwhich is a B.");
        else
                JOptionPane.showMessageDialog(null, "Your average test score" +
                                    " was\n" + Average + "\nwhich is an A.");

    }
    
}
