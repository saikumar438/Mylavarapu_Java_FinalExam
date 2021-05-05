/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

/**
 *
 * @author S542300
 */
public class GeometricDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 2 by Saikumar Mylavarapu");
        GeometricObject[] arr = new GeometricObject[5];
        GeometricObject g1 = new Square(true, 2.0);
        GeometricObject g2 = new Square(false, 3.5);
        GeometricObject g3 = new Square(true, 4.5);
        GeometricObject g4 = new Square(false, 4.2);
        GeometricObject g5 = new Square(true, 3.3);
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        arr[3] = g4;
        arr[4] = g5;

        for (GeometricObject obj : arr) {
            Square s = (Square) (obj);
            if (s.isColorable()) {
                s.howToColor();
            } else {
                System.out.println("This square is not colorable");

            }
            System.out.println("The Area of square is "+ Math.round(s.calculateArea() * 100) / 100.0);
            System.out.println("*******************************");
        }

    }

}