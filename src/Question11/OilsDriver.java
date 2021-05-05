/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

/**
 *
 * @author S542300
 */
public class OilsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 11 by Saikumar Mylavarapu");
        Oils obj1 = new Oils(20,"SunFlower");
        Oils obj2 = new Oils(10,"Freedom Refined");
        Oils obj3 = new Oils(20,"SunFlower");
        /*
        * We have obj1 and obj3 with same Oil Names we have 
        * hashcode method and equals method for Oil name attribute to get 
        * the hashcode for this attribute we can get hash code for this.
        */
        System.out.println("************** Hash Code ************** ");
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode()+" - Different value");
        System.out.println(obj3.hashCode());
        
        /*
        * We are checking the name attribute with the same quantity that returns the same hash code 
        */
        System.out.println("*************** Equals *************** ");
        /*
        * Prints True because the name attribute was same for both the objects.
        */
        System.out.println(obj1.equals(obj3));
        /*
        * Prints flase because the name attribute was different for both the objects.
        */        
        System.out.println(obj2.equals(obj1));
        /*
        * Prints false because the name attribute was different for both the objects.
        */        
        System.out.println(obj3.equals(obj2));
    }
    
}
