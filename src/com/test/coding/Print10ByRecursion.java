package com.test.coding;

public class Print10ByRecursion {
    public static void main(String[] args) {
        printbyrecursion(10);
    }

    private static void printbyrecursion(int n) {
        int i=1;
        if(n==1){
             System.out.println("adding details of these scenario");
            System.out.println("you can also add something that you need");
            System.out.println("you can also print something new here");
            //for more info please visit to nearest branch.
        }
        else{
            System.out.println(i++);
            printbyrecursion(n-1);
        }

    }
}
