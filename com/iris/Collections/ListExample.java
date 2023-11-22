package com.iris.Collections;
import  java.util.ArrayList;
public class ListExample {
    public static void main(String args[]){
        ArrayList<Double> list=new ArrayList<>();
        list.add(200.3);
        list.add(2002.7);
        list.add(785.78);
        list.add(2002.45);
        list.add(5.6);
        list.clear();
        System.out.println(list);
        ArrayList<String> names=new ArrayList<>();
        names.add("Rama");
        names.add("Krishna");
        names.remove(1);
        System.out.println(names);
        ArrayList<Character> M=new ArrayList<>();
        M.add('e');
        M.add('o');
        M.isEmpty();
        System.out.println(M);




    }
}


