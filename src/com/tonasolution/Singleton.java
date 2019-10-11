package com.tonasolution;

public class Singleton {
    private static volatile Singleton uniqueInstance = null;
    private int data = 0;

    private Singleton(){ }

    public static  Singleton getInstance(){

        if(uniqueInstance == null){
            synchronized (Singleton.class){
                uniqueInstance = new Singleton();
            }
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
