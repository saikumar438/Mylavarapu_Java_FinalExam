/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

import java.util.ArrayList;

/**
 *
 * @author S542300
 */
public class RecursionLinear {

    /**
     * @param args the command line arguments
     */
    

    
     public static int search(ArrayList<Integer> arr, int start, int end, int index)
     {
          if (end < start)
          {
            return -1;
          }
          if (arr.get(start) == index)
          {
            return start;
          }
          if (arr.get(start) == index)
          {
            return end;
          }
          
          return search(arr, start+1, end-1, index);
     }    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 9 by Saikumar Mylavarapu");
         ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(95);
        arr.add(67);
        arr.add(55);
        arr.add(12);
        arr.add(94);
        arr.add(28);
        arr.add(70);
        int index = search(arr, 0, arr.size()-1, 55);
        
        if(index>-1)
        {
            System.out.println("Element found at index "+index);
        }
        else
        {
            System.out.println("Element not found");
        }
    }
    
}
