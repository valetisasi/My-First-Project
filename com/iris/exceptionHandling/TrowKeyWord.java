package com.iris.exceptionHandling;

public class TrowKeyWord {
    static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("Eligible for vote");
        }
        else{
            System.out.println("Not eligible! for vote!");
        }
    }

    public static void main(String args[])
    {
        checkAge(20);

    }

}
