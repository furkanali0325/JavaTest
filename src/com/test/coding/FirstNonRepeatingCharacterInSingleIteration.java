package com.test.coding;

public class FirstNonRepeatingCharacterInSingleIteration {
    public static void main(String[] args) {
        String test="VISTHALSLVHIV";
        char[] charArray = test.toCharArray();
        int length = charArray.length;
        for(int i=0;i<length;i++){
            if(!test.substring(i+1,length).contains(charArray[i]+"")){
                System.out.println(charArray[i]);
                break;
            }

        }

    }
}
