package com.test.collection;

import java.util.*;

public class TwoDArrayTest {

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=Integer.parseInt(in.nextLine());
        Map<String,Long> map=new HashMap<>();
        for(int i=1;i<=n;i++)
        {
            String name=in.nextLine();
            Long phone=Long.parseLong(in.nextLine());
            map.put(name,phone);
        }
        List<String> inputNames=new ArrayList<>();
        int q=Integer.parseInt(in.nextLine());
        for(int i=1;i<=q;i++){
            inputNames.add(in.nextLine());
        }
        map.keySet().stream().forEach(k->{
            Optional<String> f=  inputNames.stream().filter(name->name.equals(k)).findFirst();
            if(f.isPresent())
                System.out.println(k+"="+map.get(k));
            else
                System.out.println("Not found");
        });
    }
}

