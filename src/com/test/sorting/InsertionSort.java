package com.test.sorting;

import java.util.stream.Stream;

public class InsertionSort {
    public static void main(String[] args) {
        int a[]={3,2,5,6,1,8,0,8},j=0;
        for(int i=0;i<a.length;i++){
            j++;
            if(j<=a.length-1 && a[i]>a[j]){
                swap(a, i,j);
                int k=i;
                while(k>0 && a[k]<a[--k]){
                    swap(a,k+1,k);
                }
            }
        }
        for (int i:a
             ) {
            System.out.println(i);

        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }


}
