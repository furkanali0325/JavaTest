package com.test.coding;

public class Print10ByRecursion {
    public static void main(String[] args) {
        printbyrecursion(10);
    }

    private static void printbyrecursion(int n) {
        int i=1;
        if(n==1){
            System.out.println("you can also add something that you need");
            System.out.println(n);
        }
        else{
            System.out.println(i++);
            printbyrecursion(n-1);
        }

    }
}
