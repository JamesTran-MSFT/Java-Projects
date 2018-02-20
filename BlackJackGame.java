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
public final class BlackJackGame {
    private  int totalPot;                
    private  int betPerHand;
    private int sides;
    private int value;
    private int total1 = 0;
    private int total2 = 0;
    
private final Scanner keyboard = new Scanner(System.in);


public BlackJackGame(int total, int bet){
    this.totalPot = total;
    this.betPerHand = bet;
    
}


public BlackJackGame(int numSides){
    sides = numSides;
    Deal();
}


public int BlackJackWelcome(){
    String input;
        
    System.out.println("Welcome to Blackjack! ");
    System.out.println("Good Luck! May the odds be in your favor.");
    System.out.println("Are you ready to begin? (y/n)");
    input = keyboard.nextLine();
    System.out.println("-----------------------");
    System.out.println("Dealing....");

        playBlackJackComputer();
        
      return totalPot;  
    } 
        
public int playBlackJackComputer(){
    int selection;
           
    BlackJackGame computer = new BlackJackGame(21);
    
    total1 += computer.value;
    
    computer.Deal2();
                
    System.out.println("The computer has " + total1);
    
    
    playBlackJackPlayer();

    
  return this.total1;  
}        


public int playBlackJackPlayer(){
    int selection;
    
    BlackJackGame player = new BlackJackGame(6);
    total2 += player.value; 
    
    player.Deal();

    System.out.println("You have: " + total2);

    System.out.println("Do you want to hit or stay? ");
    System.out.println("Enter (1)Hit OR (2)Stay");
    selection = keyboard.nextInt();
    
    while(selection == 1){
      
    total2 += getValue() + player.value; 
    
        
    if(selection == 1 || total2 <= 21){
        
        player.Deal();
        System.out.println("You now have: ");
        System.out.println("--------------");
        System.out.println(total2);
        System.out.println("Do you want to hit or stay? ");
        System.out.println("Enter (1)Hit OR (2)Stay");
        selection = keyboard.nextInt();       
        }    
    if (total2 > 21){
        System.out.println("Sorry you busted...");
        playAgain();
        }   
    else if (selection == 2){
        winnings();
        }
 
    }
    return this.total2;
}


public int winnings(){
    int totalWinnings = 0;
    
    totalWinnings += betPerHand;
  
        System.out.println("The computer had: " + total1);
        System.out.println("You had: " + total2);
    
    if(total2 == 21 || total2 == total1) {
        System.out.println("Congratulations! You won $" + totalWinnings);
    } else if (total2 > 21) {
        System.out.println("Sorry, you lost $" + betPerHand + " on that hand.");
    } else if (total1 == 21){
        System.out.println("Sorry, you lost $" + betPerHand + " on that hand.");
    } else if (total1 > 21){
        System.out.println("Congratulations! You won $" + totalWinnings);
    } else if (total2 < total1 && total1 <= 21){
        System.out.println("Sorry you lost $" + betPerHand + " on that hand.");
    } else if (total2 > total1 && total2 <= 21){
        System.out.println("Congratulations! You won $" + totalWinnings);
    }
    

    playAgain();
    
    return this.totalPot + totalWinnings;
}


public void playAgain(){
    String selection;
    
    do{
    System.out.println("Do you want to play again? (y/n)");
    selection = keyboard.nextLine();   
    
    if(selection.equals("y")){

        playBlackJackComputer();
        
    } else {
        System.exit(0);
    }
    
    } while(selection.equals("y"));
}
        

public void Deal(){
    Random cards = new Random();
    value = cards.nextInt(sides) + 1;   
}

public void Deal2(){
    Random cards = new Random();
    value = cards.nextInt(sides) + 13;
}


public int getSide(){
    return sides;
}

public int getValue(){
    return value;
}

}






    

