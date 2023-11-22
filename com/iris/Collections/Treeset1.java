package com.iris.Collections;
import java.util.TreeSet;
public class Treeset1 {
    public static void main(String[] args) {
        TreeSet<Double> list=new TreeSet<>();
        list.add(200.3);
        list.add(2002.7);
        list.add(785.78);
        list.add(2002.45);
        list.add(5.6);
        list.clear();
        System.out.println(list);
        TreeSet<String> product=new TreeSet<>();
        product.add("boll");
        product.add("bat");
        product.add("book");
        product.remove("book");
        System.out.println(product);
    }
}
