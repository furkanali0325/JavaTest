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
            System.out.println("you can also print that can be enjoy a lot for the betterment of India");
            System.out.println("Added new line for testing");
            System.out.println("Test me for fetch");
            System.out.println("you can also print something new here");
            //for more info please visit to nearest branch.
            //taking into cosdieration of all files we have consluded that nothing can be done apart from these things.
        }
        else{
              printbyrecursion(n-1);
        }

    }
}
