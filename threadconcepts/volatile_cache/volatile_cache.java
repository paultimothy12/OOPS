package com.paul.threadconcepts.volatile_cache;

public class volatile_cache implements Runnable{
    public static volatile boolean flag;

    @Override
    public void run() {
        int x=0;
        while(!flag){
            x++;
        }
        System.out.println("Thread ends");
    }
}
