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
public class Employee {

    private String name;            //Employee name
    private String department;     //Department
    private String position;      //Position
    private int idNumber;        //ID Number
    
    
/* Employee Constructor
@param n for Name, iN for ID Number, d for Department, p for Position
    */
public Employee(String n, int iN, String d, String p)
{
    name = n;
    idNumber = iN;
    department = d;
    position = p;
    
}


/* Employee no-arg constructor
accepts null values
*/
public Employee()
{
    name = " ";
    idNumber = 0;
    department = " ";
    position = " ";
    
}


public void setName(String n)
{
    name = n;
}

public void setIdNumber(int iN)
{
    idNumber = iN;
}

public void setDepartment(String d)
{
    department = d;
}

public void setPosition(String p)
{
    position = p;
}
//Gets employee name
public String getName()
{
    System.out.println("The employees name: " + name);
    return name;
}
//Gets ID Number
public int getIdNumber()
{
    System.out.println("Id Number: " + idNumber);
    return idNumber;
}
//Gets department
public String getDepartment()
{
    System.out.println("Department: " + department);
    return department;
}
//Gets Position
public String getPosition()
{
    System.out.println("Poisiton: " + position);
    System.out.println();
    return position;
}



    public static void main(String[] args) {
        String name;                //Employee name
        int idNumber;              //Id Number
        String department;        //Department
        String position;         //Position
        
        
        //Employee 1 object
        Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting",
                                           "Vice President");
        //Employee 2 object
        Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        
        //Employee 3 object
        Employee employee3 = new Employee("Joy Rogers", 81774, "Manufactoring",
                                           "Engineer");
        
        //Get employee 1's information
        employee1.getName();
        employee1.getIdNumber();
        employee1.getDepartment();
        employee1.getPosition();
        
        //Get employee 2's information
        employee2.getName();
        employee2.getIdNumber();
        employee2.getDepartment();
        employee2.getPosition();
        
        //Get employee 3's information
        employee3.getName();
        employee3.getIdNumber();
        employee3.getDepartment();
        employee3.getPosition();

        
        

    }
    
}
