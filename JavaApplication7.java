/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author عبدالإله
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mark;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter your mark");
        mark=in.nextInt();
        if(mark >=90 && mark<=100)
            System.out.println("A");
        else if(mark >=80 && mark<90)
            System.out.println("B");
        else if(mark >=70 && mark<80)
            System.out.println("c");
        else if(mark >=60 && mark<70)
            System.out.println("D");
        else System.out.println("please enter a valid mark");
    
   
    
                
    
    
    
    
    }
    
}
