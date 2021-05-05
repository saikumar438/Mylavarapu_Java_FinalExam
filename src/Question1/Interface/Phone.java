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
public interface Phone {
	
	public default void calling() {
		System.out.println("calling from phone class");
	}
	
	public default void messaging() {
		System.out.println("Messaging from Phone class");
	}
	
	public abstract void camera();
	

}