package com.test.classloader;
interface InterfaceTest {
    void display();
}

public class LamdaScopeTest {
     int x = 10;

    public static void main(String[] args) {
        LamdaScopeTest t = new LamdaScopeTest();
        t.extracted();
    }

    private void extracted() {
        int y = 100;
        InterfaceTest t = () -> {
            x = 200;
            System.out.println("x is: " + x);
            System.out.println("x is: " + this.x);
            System.out.println("y is: " + y);
        };
        t.display();
    }
}
