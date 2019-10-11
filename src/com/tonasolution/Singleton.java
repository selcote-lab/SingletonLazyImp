package com.tonasolution;

public class Singleton {
    private static Singleton uniqueInstance = null;
    private int data = 0;

    private Singleton(){ }

    public static synchronized Singleton getInstance(){

        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }

        return uniqueInstance;
    }

    public void setData(int data){
        System.out.println(data);
        this.data = data;
    }

    public int getData() {
        return data;
    }
}
