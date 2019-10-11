package com.tonasolution;

public class Singleton {
    private static volatile Singleton uniqueInstance = null;
    private int data = 0;

    private Singleton(){ }

    private static class SingletonHelper {
        private static final Singleton uniqueInstance = new Singleton();
    }
    public static  Singleton getInstance(){
        return SingletonHelper.uniqueInstance;
    }

    public void setData(int data){
        System.out.println(data);
        this.data = data;
    }

    public int getData() {
        return data;
    }
}
