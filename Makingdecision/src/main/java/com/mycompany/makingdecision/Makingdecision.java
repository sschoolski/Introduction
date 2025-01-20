/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.makingdecision;
/**
 *
 * @author ckmacharia
 */
import java.util.Scanner;
public class Makingdecision {
    
    
     /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /*a program that gets input and makes decisions */
        /*if x>y print x is greater*/
        
        int x;
        Scanner s =new Scanner(System.in);
        System.out.println("Enter X");
        x=s.nextInt();
        int y;
        System.out.println("Enter Y");
        y=s.nextInt();
        if (x>y){
        
        System.out.println(x+"\t is greater than\t" + y);
        }
        else{
            System.out.println(y+"\t is greater than\t"+x);
        }
            
        // TODO code application logic here
    }

}
