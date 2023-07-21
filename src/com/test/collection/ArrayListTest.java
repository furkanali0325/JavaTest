package com.test.collection;


import java.util.*;

public class ArrayListTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> list=new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int d = sc.nextInt();
            List<Integer> list1=new ArrayList<>();
            for (int j = 1; j <= d; j++) {
                list1.add(sc.nextInt());
            }
            list.add(list1);
        }
        int q = sc.nextInt();
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 1; i <= q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            map.put(x,y);
        }

        map.keySet().stream().forEach(k->{
            if(k<list.size()){
                List<Integer> subList=list.get(k-1);
                if(map.get(k)<subList.size()){
                    System.out.println(subList.get(map.get(k)));
                }
                else
                {
                    System.out.println("ERROR");
                }
            }
            else
                System.out.println("ERROR");

        });

    }
}
