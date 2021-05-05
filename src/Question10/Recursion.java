/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

/**
 *
 * @author S542300
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    static int count =0;
    public static int sumOfDigits(int num)
    {
        if(num == 1 )
        {
            return 1;
        }
        if(num > 1)
        {
            return count = num + sumOfDigits(num-1);
        }
        return count;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Question 10 by Saikumar Mylavarapu");
        System.out.print("The Sum of digits of 10 is ");
        System.out.println(sumOfDigits(10));
    }
    
}
