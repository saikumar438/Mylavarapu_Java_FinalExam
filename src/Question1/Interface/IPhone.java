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
public class IPhone implements Phone,IPhone1Generation{

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		
		System.out.println("Camera in IPhone class");
		
	}

    @Override
    public void internet() {
        System.out.println("Internet from IPhone class extended from 1st generation interface");
    }


}