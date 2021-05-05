/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9;

/**
 *
 * @author S542300
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    
    public void checkMarks(double marks) 
    {
        if(marks<=60)
        {
            throw new ArithmeticException("Student have failed the exam");
        }
        else
        {
            System.out.println("Student have passed the exam");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 9 by Saikumar Mylavarapu");
        try{
            Student obj = new Student();
            obj.checkMarks(96);
            obj.checkMarks(50);
            
        }catch(ArithmeticException ae)
        {
            System.out.println(ae);
        }
    }
    
}
