/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quesiton8;

import java.util.Scanner;

/**
 *
 * @author S542300
 */
public class Employee {

    /**
     * @param args the command line arguments
     */
    
    public static double salary;

    public Employee(double salary) {
        this.salary = salary;
    }
    
    
    public static void checkSalary()
    {
        
        if(salary<1000)
        {
            throw new IllegalArgumentException("The salary of an employee should be greator than 1000 ");
        }
        else
        {
            System.out.println("The salary of an empployee is "+salary+" $");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 8 by Saikumar Mylavarapu ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary of an employee ");
        Employee emp = new Employee(sc.nextInt());
        try{
        emp.checkSalary();
        }catch(IllegalArgumentException ex)
        {
            System.out.println(" "+ex);
        }
    }
    
}
