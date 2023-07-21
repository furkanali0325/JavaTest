package com.test.collection;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put(null,1);
        map.put(null,2);
        System.out.println("size of the hashmap is "+map.size());

    }
}
