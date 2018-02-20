/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import javax.swing.*;
import java.util.*;
import java.io.*;


/**
 *
 * @author James Tran
 */
public class UpperCaseFileConverter {

    public static void main(String[] args) throws IOException
    {      
    
    // Variables
      String fileIn, fileOut, textLine;
      
      
    // Get filename input.
      fileIn = JOptionPane.showInputDialog(null, "Input file name?");
      fileOut = JOptionPane.showInputDialog(null, "Output file name?");
      
    // Open the input file to be read.
      FileReader readFile = new FileReader(fileIn);
      BufferedReader readFileInput = new BufferedReader(readFile);
      
    // Open output file to be written to.
      FileWriter writeFile = new FileWriter(fileOut);
      BufferedWriter writeFileOutput = new BufferedWriter(writeFile);
      
    // Read the first line of text and save to string.
      textLine = readFileInput.readLine();
      
    // Loop through all lines until empty.
      while(textLine != null)
      {
    // Convert each line to all uppercase, write to file then
        // also write a new line. 
         textLine = textLine.toUpperCase();
         writeFileOutput.write(textLine);
         writeFileOutput.newLine();
         textLine = readFileInput.readLine();
      }
      
      
    // Close both files.
      readFileInput.close();
        writeFileOutput.close();

    }
    
}
