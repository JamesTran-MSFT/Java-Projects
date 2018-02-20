/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import java.util.*;

/**
 *
 * @author James Tran
 */
public class PresentValue {


    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
// gets FV         
    System.out.println("Enter the Furture Value you want to have."); 
        double futureValue = input.nextDouble();
        
// gets  rate
    System.out.println("Enter the Interest Rate.");
        double interestRate = input.nextDouble();
        
//gets  time
    System.out.println("Enter the number of years you plan to "
                                            + "let the interest compound. "); 
        double time = input.nextDouble();

     
// Print to screen the present value         
    System.out.println(presentValue(futureValue, interestRate, time)); 
    }

    
    
    public static double presentValue(double futureValueR, double interestRateR, double yearsR) 
    {
//Tests the arguments
    System.out.println("future: " + futureValueR + " // Int rate: " +  interestRateR +
                                    " // years: " +  yearsR); 
// Will return the present Value    
return futureValueR / Math.pow((1 + interestRateR), yearsR); 

    }
}
