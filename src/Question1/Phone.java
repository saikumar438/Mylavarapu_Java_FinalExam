/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

/**
 *
 * @author S542300
 */
public abstract class Phone {

	public void calling() {
		System.out.println("calling from phone class");
	}
	
	public void messaging() {
		System.out.println("Messaging from Phone class");
	}
	
	public abstract void camera();
	public abstract void internet();
}

