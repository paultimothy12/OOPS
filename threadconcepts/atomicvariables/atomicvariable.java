package com.paul.threadconcepts.atomicvariables;

import java.util.concurrent.atomic.AtomicInteger;

public class atomicvariable implements Runnable{
    AtomicInteger x = new AtomicInteger();

    @Override
    public  void run() {


        for (int i = 0; i < 5; i++)
        {
            try {
                x.getAndIncrement();
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public int getVal(){
        return x.get();
    }
}
