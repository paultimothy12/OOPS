package com.paul.multithreading;

public class multithread_threadclass extends Thread{
    private int threadnum;

    public multithread_threadclass(int threadnum) {
        this.threadnum = threadnum;
    }

    @Override
    public void run(){
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
