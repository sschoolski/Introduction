/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.weeklessson3;
import java.util.Scanner;

/**
 *
 * @author ckmacharia
 */
public class WeekLessson3 {
    static int x, y;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two numbers");
        x=s.nextInt();
        y=s.nextInt();
        int result=outputfnc(x,y);
        System.out.println("The larger one is " + result);
}

public static int outputfnc(int x, int y){


int result;
if (x>y){
result=x;
} else{
        result=y;
    }
return result;
}
}
