package com.test.collection;

import java.util.*;

public class DeQueueTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
        }
        List<List<Integer>> subList = new ArrayList<>();
        Iterator<Integer> itr = deque.iterator();
        int j=m;
        while (!deque.isEmpty()) {
            List<Integer> sub = new ArrayList<>();
            Integer first = deque.element();
            while (itr.hasNext() && j>0) {
                sub.add(first);
                first=itr.next();
                j--;
            }
            j=m;
            subList.add(sub);
            deque.removeFirst();
        }
        System.out.println(subList);


    }
}



