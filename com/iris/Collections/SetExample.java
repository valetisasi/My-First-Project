package com.iris.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class SetExample {
    public static void main(String[] args) {
        HashSet<Integer> trees=new HashSet<>();
        trees.add(77);
        trees.add(0);
        trees.add(199);

        System.out.println(trees);

        LinkedHashSet<Double> avgs=new LinkedHashSet<>();
        avgs.add(22.22);
        avgs.add(99.99);
        avgs.add(88.67);
        avgs.add(null);
        System.out.println(avgs);

        Iterator<Double> avgs_new= avgs.iterator();

        while (avgs_new.hasNext()){
            System.out.println(avgs_new.next());
        }

        TreeSet<String> cars=new TreeSet<>();
        cars.add("bmw");
        cars.add("audi");
        cars.add("honda");
        cars.add("hyundai");
        cars.add("audi");

        System.out.println(cars);

        /*
        Syntax:

        Iterator<DataType> variable=setName.iterator();

         */
        Iterator<String> cars2= cars.iterator();

        while (cars2.hasNext())
        {
            System.out.println(cars2.next());
        }


    }
}
