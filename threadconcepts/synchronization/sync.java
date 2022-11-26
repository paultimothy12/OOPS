package com.paul.threadconcepts.synchronization;

public class sync implements Runnable{
    private int x;

    @Override
    public synchronized void run() {
        //Synchronized methods: Only 1 thread to access synchronized method and force other threads to wait
        //Mutual exclusion - Lock on shared resources.
        //Avoid data inconsistency
        for (int i = 0; i < 5; i++)
        {
            try {
                x++;
                //ADD THIS TO KNOW CURRENT ACCESSING THREAD
                // System.out.println("Current Thread Name: "+ Thread.currentThread().getName());
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public int getVal(){
        return x;
    }
}
