package com.paul.threadconcepts.atomicvariables;


public class Main
{
    public static void main(String[] args) throws InterruptedException {

        atomicvariable v = new atomicvariable();
        Thread t1= new Thread(v);
        t1.start();

        Thread t2=new Thread(v);
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Main executed!!! "+v.getVal());
    }
}