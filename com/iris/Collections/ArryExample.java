package com.iris.Collections;

public class ArryExample {
    public static void main(String[] args) {
        String namesList[]=new String[15];
        namesList[3]="Rama";
        namesList[12]="Krishna";
        //namesList[2]=2002;
        //we can't extend or shrink the array

        for(int i=1; i<namesList.length;  i++)
        {
            System.out.println(namesList[i]);
        }

    }

}

