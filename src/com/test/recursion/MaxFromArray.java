package com.test.recursion;

public class MaxFromArray {
    public static void main(String[] args) {
        int a[]={77,4,2,6,10,5,33,0,55,99};
        int max=findmax(a,a.length);
        System.out.println("Maximum element is "+max);
    }

    private static int findmax(int[] a, int n) {
        int max=a[0];
        if(n==1)
            return max;
        else if(max<a[n-1]){
            max=a[n-1];
            a[0]=max;
            return findmax(a,n-1);
        }
        return findmax(a,n-1);
    }
}
