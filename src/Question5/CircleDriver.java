/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

import java.util.ArrayList;


/**
 *
 * @author S542300
 */
public class CircleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Question 5 by Saikumar Mylavarapu");
        System.out.println("**************************");
        ComparableCircle c1 = new ComparableCircle(7.5);
        ComparableCircle c2 = new ComparableCircle(2.5);
        
        System.out.println("The area of first circle is "+c1.area());
        System.out.println("The area of second circle is "+c2.area());
        System.out.println("**************************");
        if (c1.compareTo(c2) > 0) 
        {
            System.out.println("Area of first circle is larger.");
        } 
        else if (c1.compareTo(c2) < 0)
        {
            System.out.println("Area of second circle is larger");
        }
        else
        {
            System.out.println("Area of ​​the two circles are same");
        }
    }

}