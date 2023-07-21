package com.test.collection;

import java.util.ArrayList;
import java.util.List;

public class FIndSubArrays {



    public static void main(String[] args) {
        List<Integer> list= List.of(1,2,3,4);
        List<List<Integer>> subList=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            for(int j=i;j<list.size();j++){
                List<Integer> sub=new ArrayList<>();
                for(int k=i;k<=j;k++){
                    sub.add(list.get(k));
                }
                subList.add(sub);
            }
        }
        System.out.println(subList);
        System.out.println(subList.size());
    }

}
