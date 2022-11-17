package com.paul.multithreading;

public class multithread_runnableinterface implements Runnable{
    private int threadnum;

    public multithread_runnableinterface(int threadnum) {
        this.threadnum = threadnum;
    }

    @Override
    public void run() {
        for(int i=0; i<5;i++){
            System.out.println(i+" from thread"+threadnum);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
