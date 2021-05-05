/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

import java.util.Objects;

/**
 *
 * @author S542300
 */
public class Oils {
    
    private int quantity;
    private String oilName;

    public Oils(int quantity, String oilName) {
        this.quantity = quantity;
        this.oilName = oilName;
    }

    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOilName() {
        return oilName;
    }

    public void setOilName(String oilName) {
        this.oilName = oilName;
    }

    @Override
    public String toString() {
        return "Oils{" + "quantity:- " + quantity + ", oilName:- " + oilName + '}';
    }

    /*
    * Returns hashcode for every object created for this class.
    */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.oilName);
        return hash;
    }
    /*
    * Takes object as parameter used for comparing class nad we are checking 
    * if two objects have same values then they are equal.
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Oils other = (Oils) obj;
        return Objects.equals(this.oilName, other.oilName);
    }
}
