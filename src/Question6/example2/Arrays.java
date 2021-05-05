/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6.example2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author S542300
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        int arr[] = new int[10];
            System.out.println("Question 6 by Saikumar Mylavarapu");
        System.out.println("Enter 10 numbers ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
         System.out.println("Enter a index number to find the element in the array ");
         int num =sc.nextInt();
            System.out.println("The element at the index is "+arr[num]);
        
        }
        catch(InputMismatchException ex){
            System.out.println(""+ex);
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("The number entered is greater than 10 "+ex);
                    
        }
    }
    
}
