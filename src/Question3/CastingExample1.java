/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author S542300
 */
public class CastingExample1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int intNum = 15;
        double doubleNum = 35.66687;
        float floatNum;
        long longNum = 176334984;
        
        longNum = intNum;
        floatNum = intNum;
        doubleNum = floatNum;
        
        
          System.out.println("Question 3 by Saikumar Mylavarapu");      
        System.out.println("Implicit Conversion");
        System.out.println("The value of int is "+intNum);
        System.out.println("The value of double is "+doubleNum);
        System.out.println("The value of float is "+floatNum);
        System.out.println("The value of long is "+longNum);
        System.out.println("**************************");
        
        doubleNum = 34.6;
        floatNum = (float)doubleNum;
        longNum = (long)floatNum;
        intNum = (int)longNum;
        doubleNum = (double)intNum;
        System.out.println("Explicit Conversion");
        System.out.println("The value of int is "+intNum);
        System.out.println("The value of double is "+doubleNum);
        System.out.println("The value of float is "+floatNum);
        System.out.println("The value of long is "+longNum);        
    }
    
}
