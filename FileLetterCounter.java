/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import java.util.*;
import javax.swing.*;
import java.io.*;


/**
 *
 * @author James Tran
 * 23 January 2018
 */
public class FileLetterCounter {

    
    public static void main(String[] args) throws IOException
{
String userFileName;                   //User created file name
String userContents;                  //User entered content
String userContentsFromFile;        //Reading user contents from the file   
char userCharacter;                //User selected character to count
int characterCount = 0;           //Setting accumulation to 0
String userInputString;

 //Scanner for user input
 Scanner scanner = new Scanner(System.in);
 
//Asking for user input for desired file name
 System.out.println("Please enter the name of a file with (.txt) entension: ");
        userFileName = scanner.nextLine();
 
//PrintWriter for writing into the file.txt
 PrintWriter userWriteFile = new PrintWriter(userFileName);
    System.out.println( userFileName + " has been created");
 
//User desired input for the file created
 System.out.println("Please enter what you want to write in " + userFileName);
        userContents = scanner.nextLine();
        
//Writing user input into file
userWriteFile.println(userContents);
    System.out.println(userContents + " has been written to " + userFileName);
 
 //Closing input file
 userWriteFile.close();
 
 //File to open user created file for reading
 File userCreatedFile = new File( userFileName);
 
 //Program letting user know what it is doing
    System.out.println("Checking to make sure " + userFileName + "exists...");
    
    //If statement: whether file exists or not
    if (!userCreatedFile.exists()) {
            System.out.println("File does not exist");
    } else {
            System.out.println("File exists. Reading from " + userFileName +
                            " ...");
        
    //Scanner to read ouput of file
    Scanner userCreatedFileToScan = new Scanner (userCreatedFile);
        userContentsFromFile = userCreatedFileToScan.nextLine();
    
    //User designated character to count from file
        System.out.println("Please enter a character to count");
            userCharacter = scanner.nextLine().charAt(0);
        
    //For loop to count selected character
        for(int index = 0; index < userContentsFromFile.length(); index++){
            if (userContentsFromFile.charAt(index) == userCharacter) {
                characterCount = characterCount + 1;
            }
    //Closing output file
    userCreatedFileToScan.close();
        }
        
    //Displaying character selected, file selected, and # of character(s)
    System.out.println(userCharacter + " appears in " + 
                userContentsFromFile + " " + characterCount + " time(s)");
    }

    }

}
