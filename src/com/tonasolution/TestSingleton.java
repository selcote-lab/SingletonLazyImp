package com.tonasolution;

public class TestSingleton {
    public static void main(String[] args) {

        Singleton s = Singleton.getInstance();
        s.setData(33);

        System.out.println("First reference: " + s);
        System.out.println("Singleton data value is: " + s.getData());

        Singleton s2 = Singleton.getInstance();
        s.setData(38);

        System.out.println("First reference: " + s2);
        System.out.println("Singleton data value is: " + s2.getData());

    }
}
