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
public class SlotMachineGame {
    private int totalPot;               //Total in users Pot     
    private int betPerHand;            //Bet Per "Spin"
    
    
/* SlotMachingGame Constructor
Used to initialize totalPot and BetPerHand from Main class
@param int pot, int bet    
*/
public SlotMachineGame(int pot, int bet)
{
    this.totalPot = pot;
    this.betPerHand = bet;

}

/*slotMachine Method used to play game
@return totalPot + totalWinnings
*/
public int slotMachine(){
    int totalWinnings = 0;                //Used to calculate winnings
    int totalForGame = 0;                //Used to calculate winnings per spin
    int calc1 = 0;                      //Array location1 used with Random
    int calc2, calc3 = 0;              //Array location2/3 used with Random
    String input;                     //User Input for start/end game
    
    //Array of possible "Spin" selections
    String [] selection = {"Cherries", "Oranges", "Plums", "Bells", "Melons",
                           "Bars"};
    
    //Random to cycle through Array and select a random index
    Random slot = new Random();
    
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Welcome to the slot machine! ");
    System.out.println("Good Luck! May the odds be in your favor.");
    System.out.println("Are you ready to begin? (y/n)");
    input = keyboard.nextLine();
    System.out.println("-----------------------");
    System.out.println("Spinning....");
    
//Do While to cycle through game
    do{
        calc1 = slot.nextInt(selection.length); // Random Array selection 1
            calc2 = slot.nextInt(selection.length); // Random Array selection 2
                calc3 = slot.nextInt(selection.length); // Random Array selection 3
                
        //Outputs for each random selection
        System.out.println(selection[calc1]); 
        System.out.println(selection[calc2]);
        System.out.println(selection[calc3]);
        
 /*IF selection 1 = 2 OR selection 1 = 3 OR selection 2 = 3
        Bet per Hand will be multiplied by 2
   IF selection 1 = 2 AND selection 1 = 3 AND selection 2 = 3
        Bet Per Hand will be multiplied by 3
   IF None of the selections match
        User loses Bet per Hand placed
*/
    if(calc1 == calc2 || calc1 == calc3 || calc2 == calc3){
        totalForGame = betPerHand * 2;
        System.out.println("You won $" + totalForGame + " on this hand!");
        totalWinnings += totalForGame;
    }
    if (calc1 == calc2 && calc1 == calc3 && calc2 == 3) {
        totalForGame = betPerHand *3;
        System.out.println("You won $" + totalForGame + " on this hand!");
        totalWinnings += totalForGame;
    }
    if (calc1 != calc2 && calc1 != calc3 && calc2 != calc3){
        totalForGame = - (betPerHand)  ;
        System.out.println("You lost $" + totalForGame + " on this hand...");
        totalWinnings += totalForGame;
    }
                  

        System.out.println("Do you want to play again? (y/n)");
        input = keyboard.nextLine();
    } while(input.equals("y"));
    
    //TotalPot start + total winnings per spin.
    totalPot += totalWinnings;
    System.out.println("------------------");
    System.out.println("Your total winnings is: ");
    System.out.println("$" + totalWinnings);
    System.out.println("------------------");
    System.out.println("Your Pot is now: ");
    System.out.println("$" + totalPot);
    
    
    
    return this.totalPot + totalWinnings;
} 




}