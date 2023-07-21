package com.test.collection;
        import java.util.*;
        import java.util.concurrent.CopyOnWriteArrayList;

public class ListTest {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        //int N=sc.nextInt();
        List list1=Arrays.asList(12,0,1,78,12);
        List<Integer> list=new CopyOnWriteArrayList<>(list1);

//        for(int i=1;i<=N;i++){
//            list.add(sc.nextInt());
//        }
        System.out.println(list);
        int Q=2;
        for(int i=1;i<=Q;i++){
            String s=sc.nextLine();
            if(s.equals("Insert")){
                int index=5;
                int value=23;
                list.add(index-1,value);
            }
            System.out.println(list);
            if(s.equals("Delete"))
                list.remove(0);
        }
        System.out.println(list);
    }
}