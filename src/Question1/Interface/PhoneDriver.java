/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1.Interface;

/**
 *
 * @author S542300
 */
public class PhoneDriver {
    
    	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPhone obj = new IPhone();
		System.out.println("Output for Question 1 by Saikumar Mylavarapu");
                System.out.println("This is an example for interface ");
                System.out.println("************************");
		obj.camera();
		obj.calling();
		obj.internet();
		obj.messaging();
	}

}
