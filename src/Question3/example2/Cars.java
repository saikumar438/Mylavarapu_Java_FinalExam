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
public class Cars extends Vehicle{

    public Cars() {
        System.out.println("Constructor in CARS class");
    }

    @Override
    public void maxSpeed() {
        System.out.println("The maximum speed of a CAR is 278 MPH");
    }
    
}
