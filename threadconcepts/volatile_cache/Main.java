package com.paul.threadconcepts.volatile_cache;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        volatile_cache v= new volatile_cache();
        Thread t1 = new Thread(v);
        t1.start();
        Thread.sleep(1000);

        volatile_cache.flag = true;
        System.out.println("Main completed!!");

    }
}
