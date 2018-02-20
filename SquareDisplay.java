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
public class SquareDisplay {

    public static void main(String[] args) {
        
int userInput = 0;              //UserInput of number
int rows, cols = 0;            //Setting cols to 0


//Scanner for user input
        Scanner scanner = new Scanner(System.in);
            
System.out.println("Please enter a number no greater than 15.");
userInput = scanner.nextInt();


for (cols = 0; cols < userInput; cols++)
{
    for (rows = 0; rows < userInput; rows++)
    {
        System.out.print("X");
    }
    System.out.println();
}

    }
    
}
