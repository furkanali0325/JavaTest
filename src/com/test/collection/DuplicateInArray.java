package com.test.collection;

import java.util.*;


public class DuplicateInArray {
    public static void main(String[] args) {
        System.out.println(duplicate());
    }

    private static List<Integer> duplicate() {
        int arr[] = {0, 3, 1, 2};
        int n = 4;
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(arr[i]))
                map.put(arr[i], 1);
            else
                map.put(arr[i], map.get(arr[i]) + 1);
        }
        ArrayList<Integer> list = (ArrayList<Integer>) map.keySet().stream().filter(k -> map.get(k) > 1).collect(java.util.stream.Collectors.toList());
        if (!list.isEmpty())
            return list;
        else
            return List.of(-1);
    }
}
