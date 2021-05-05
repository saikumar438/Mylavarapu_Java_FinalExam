/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3.example2;

/**
 *
 * @author S542300
 */
public class CastingExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 3 by Saikumar Mylavarapu");
        System.out.println("********************************");
        System.out.println("Implicit type casting");
        System.out.println("********************************");
        Cars obj = new Cars();
        Vehicle v=obj;
        v.maxSpeed();
        System.out.println("********************************");
        System.out.println("Explicit type casting");
        System.out.println("********************************");
        Cars obj2 = (Cars)v;
        obj2.maxSpeed();
    }
    
}
