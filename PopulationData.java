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
 */
public class PopulationData {

    public static void main(String[] args) throws IOException
    {
    final int SIZE = 42;
    int[] number = new int[SIZE];
    int i = 0;
    int total = 0;
    int average;

    File file = new File("USPopulation.txt");
    Scanner inputFile = new Scanner(file);

    while (inputFile.hasNext() && i < number.length)
    {
       number[i] = inputFile.nextInt();
       total += number[i];
       i++;
    }

    average = total / number.length;

    System.out.println("The average annual change in population is: " + average);

    inputFile.close();
  }
}
        