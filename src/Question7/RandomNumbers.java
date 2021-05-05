/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

import java.util.Scanner;


/**
 *
 * @author S542300
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    
    public static void randomValue(int num){
        int arr[] = new int[100];
        for(int i=0;i<100;i++)
        {
            arr[i]=(int)Math.floor(Math.random()*100);
        }      
        if(num>-1 && num<100)
        {
            System.out.print("The value at the position "+num+" is ");
            System.out.println(arr[num]);
            
        }
        else
        {
            System.out.println("Out Of Bounds");
        }
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Question 7 by Saikumar Mylavarapu");
        System.out.println("Enter the index of the array :- ");
        randomValue(sc.nextInt());
    }
    
}
