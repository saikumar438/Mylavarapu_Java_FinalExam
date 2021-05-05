/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quesiton8.example2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author S542300
 */
public class InputFile {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        System.out.println("Question 8 by Saikumar Mylavarapu");
        try{
        Scanner sc = new Scanner(new File("input.txt"));
        System.out.println("There is no file in the root directory");
        }
        catch(FileNotFoundException fe){
            System.out.println(fe.getMessage());
        }

    }

}
