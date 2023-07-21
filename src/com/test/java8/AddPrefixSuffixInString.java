package com.test.java8;
public class AddPrefixSuffixInString {
    public static void main(String[] args) {
        System.out.println("final string is ="+addPrefixAndSiffix("Furkan","Mohd","Ali"));
    }


    public static String addPrefixAndSiffix(String testString,String prefix,String suffix){
       String temp="";
       temp+=temp+prefix+testString+suffix;
        return temp;
    }
}
