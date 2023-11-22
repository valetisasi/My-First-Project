package com.iris.Collections;
import java.util.LinkedList;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer>list1=new LinkedList<>();
        list1.add(22);
        list1.add(2002);
        list1.add(785);
        list1.add(2002);
        list1.add(5);
        System.out.println(list1);
        LinkedList<String>animals=new LinkedList<>();
        animals.add("dog");
        animals.add("cat");
        animals.add("cow");
        animals.add(2,"cow");
        System.out.println(animals);
    }
}
