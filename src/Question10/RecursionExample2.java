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
public class RecursionExample2 {

    /**
     * @param args the command line arguments
     */
    static int sum=0,rem;
    public static int reverse(int num)
    {
      if(num >0){
      rem=num%10;
      sum=sum*10+rem;
      reverse(num/10);
   }
   else
      return sum;
   return sum;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Question 10 by Saikumar Mylavarapu");
        System.out.print("The reverse of a number 678 is ");
        System.out.println(reverse(678));
    }
    
}
