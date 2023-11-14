package com.iris.exceptionHandling;
import java.util.Scanner;
public class Exception1 {
    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1=s.nextInt();
        System.out.print("Enter number 2 : ");
        int num2=s.nextInt();
        try {
            System.out.println(num1 / num2);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("rama");
        System.out.println("krishana");

    }
}


