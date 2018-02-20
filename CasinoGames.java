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
public class CasinoGames {
    private static int totalPot;            //Total user wants to play with            
    private static int betPerHand;         //Bet per "Spin/Hand" (game-dependent)
    private static String name;           //User name
    private static final Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        String playAgain = "y";
        String input;               //Input of name
        
   
        System.out.println("Welcome to the Casino games! ");
        System.out.println("What is your name?");
        name = keyboard.nextLine();
        System.out.println("Hello " + name + "!");
        configureHand(); //Calling configureHand method
    }

    
/*Configure Hand
Asks amount to put into pot = totalPot
Asks for minimum bet = betPerHand    
*/    
public static void configureHand(){
    System.out.println("Before we begin"
                            + " please input how much you want to play with?");
    System.out.println("The minimum input is $20 and max is $1000");
    totalPot = keyboard.nextInt();
    
    System.out.println("How much would you like to bet per hand?");
    betPerHand = keyboard.nextInt();

    //User cannot bet more than what is in their pot
    if(betPerHand > totalPot){
        System.out.println("You're betting more than you have in your pot");
        configureHand();
    }
    System.out.println("Lets Begin!");
    playGames(); //Calls playGames Method
    
    System.out.println(name + ": ");
    System.out.println("Thank you for visiting the Casino Games!");
    System.out.println("We hope to see you again soon!");

}


//PlayGames Method makes a selection on which game to play
public static void playGames(){
    int input;      //Accepts user input for selection
    
    //Slot Machine Game Object to call slot machine game
    SlotMachineGame slots = new SlotMachineGame(totalPot, betPerHand);
    //Black Jack Game Object to call black jack game
    BlackJackGame cards = new BlackJackGame(totalPot, betPerHand);
    
    
    System.out.println("Please select which game you would like to play!");
    System.out.println("Select (1) for Slots or (2) for Blackjack!");
    input = keyboard.nextInt();

/* Switch Statment to evaluate user input
    Case 1 - If user inputs #1, SlotMachine will be called
        totalPot will transfer over to SlotMachineGame Class
    
    Case 2 - If user inputs #2, BlackJack will be called
        totalPot will transfer over to BlackJackGame Class
    
    Default - If user input is invalid, playGames method will be called
        re-iterating method until valid input is accepted
*/
    switch (input) {
        case 1:
            totalPot = slots.slotMachine();
            break;
        case 2:
            totalPot = cards.BlackJackWelcome();
            break;
        default:
            System.out.println("Please make a valid Selection: ");
            System.out.println("(1)Slots OR (2)Blackjack");
            System.out.println("--------------------------------");
            playGames();
            break;
        }
}


}
    

