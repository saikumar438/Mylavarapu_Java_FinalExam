/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9.example2;

/**
 *
 * @author S542300
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 9 by Saikumar Mylavarapu");
        try{
            CheckMarks obj=new CheckMarks();
        
        int marks=110;
       //int marks=0;
        if(marks>100){
            throw new IllegalArgumentException("Marks cannot be greator than 100");
        }else{
            System.out.println(obj.checkMarks(0));
        }
        }catch(ArithmeticException ae){
            System.out.println(ae);
        }
        catch(RuntimeException re){
            System.out.println(re);
        }
    }

}
