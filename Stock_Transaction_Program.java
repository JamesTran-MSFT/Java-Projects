/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author James
 * 11 January 2018
 */
public class Stock_Transaction_Program {


    public static void main(String[] args) {
        final double shares = 1000;     //Amount of shares purchased & sold
        final double commission = .02;  //Amount of commission paid
        final double purchase = 32.87;  //Shares purchase price
        final double sold = 33.92;      //Shares sold price
        double brokerBought;            //Amount he paid broker when bought 
        double brokerSold;              //Amount he paid broker when sold
        double totalBought;             //Amount he paid
        double totalSold;               //Amount he sold
        
        //Amount Joe paid for stocks
        totalBought = purchase * shares;
        brokerBought = (purchase * shares) * commission;
        System.out.println("Joe paid $" + totalBought + " for the stocks." +
                           " He paid $" + brokerBought + " to his broker.");
        
        //Amount Joe sold his stocks for
        totalSold = sold * shares;
        brokerSold = (sold * shares) * commission;
        System.out.println("Joe sold his shares for $" + totalSold +
                           ". He paid his broker $" + brokerSold);
        
        //Amount of profit
           double profit;
        profit = (totalSold - totalBought) - (brokerBought + brokerSold);
        System.out.println("Joe's total earnings was $" + profit);
                
        
    }
    
}
