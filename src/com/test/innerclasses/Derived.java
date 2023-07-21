package com.test.innerclasses;

 class Test {
    static int i = 10;

    static {
        methodOne();
        System.out.println("base static block");
    }

    public static void main(String[] args) {
        methodOne();
        System.out.println(Math.random());
    }

    private static void methodOne() {
        System.out.println(j);
    }

    static int j = 20;
}

public class Derived extends Test {
    static int x = 100;

    static {
        methodTwo();
        System.out.println("derived first static block");
    }

    public static void main(String[] args) {
        methodTwo();
        System.out.println("derived main");
    }

    public static void methodTwo() {
        System.out.println(y);
    }

    static {
        System.out.println("derived second static block");
    }

    static int y = 200;
}

//output
//20
//basic static block
//20
//random number
//200
//derived main
//derived second static block
//200
