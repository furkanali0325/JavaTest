package dsa;

public class PrintKSubstringOfArray {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        printKSubString(a,a.length);
    }

    private static void printKSubString(int[] a, int length) {
        if(length<1)
            System.out.println(a);
        else
        {
            for(int i=1;i<=length-1;i++){
                a[length-1]=i;
                printKSubString(a,length-1);
            }
        }

    }


}
