package com.iris.exceptionHandling;

public class TrowKeyWord2 {
    static void fun(){
        try {
            throw new NullPointerException("I just threw an exception");
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }


    public static void main(String args[]){
        fun();

    }
}


