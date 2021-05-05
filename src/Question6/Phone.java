/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author S542300
 */
public class Phone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        
      try{
        ArrayList<String> arr = new ArrayList<>();
        Scanner sc = new Scanner(new File("temp.txt"));
        System.out.println("Question 6 by Saikumar Mylavarapu");
        while(sc.hasNext())
        {
            arr.add(sc.next());
        }
        for (String string : arr) {
            
            System.out.println(string);
        }
        sc = new Scanner(new File("anothertemp.txt"));
        
      }
      catch(FileNotFoundException ex){
          System.out.println(""+ex);
                  
      }
        
    }
    
}
