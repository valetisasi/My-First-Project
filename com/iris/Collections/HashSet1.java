package com.iris.Collections;
import java.util.HashSet;
public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> product = new HashSet<>();
        product.add("pen");
        product.add("bag");
        product.add("book");
        product.remove("book");
        System.out.println(product);
        HashSet<Character> S = new HashSet<>();
        S.add('e');
        S.add('o');
        
        System.out.println(S);
    }
}

