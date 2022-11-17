package com.paul.multithreading;

public class Main {
    public static void main(String[] args) throws Exception {
                     //--------------USING THREAD CLASS-----------------

        //We are overriding the run() method in Thread Class
        //start() - start the thread, isAlive() returns boolean if thread is running alive or thread ended
        //join()- waits for current thread to end


        //single thread------------>

        multithread_threadclass threadobj1 = new multithread_threadclass(1);
        threadobj1.start();

        //multiple thread - 5 threads using for loop------------->

        for(int i=0;i<5;i++) {
            multithread_threadclass threadobj2 = new multithread_threadclass(i);
            System.out.println(threadobj2.isAlive()); //prints false(thread not started)
            threadobj2.start(); //starts current thread(becomes alive)
            System.out.println(threadobj2.isAlive()); //prints true( thread started)
            threadobj2.join(); // after current thread ends, starts next thread ------ add throws Exception for main method()
        }





                     //--------------USING RUNNABLE INTERFACE-----------------
        //When using runnable interface we are overriding the run method like thread class,
        //but we need to create obj for Thread class and pass the (threadobj) as arguements.

        //start() - start the thread, isAlive() returns boolean if thread is running alive or thread ended
        //join()- waits for current thread to end

        //single thread--------->

        multithread_runnableinterface threadobj3 = new multithread_runnableinterface(1);
        Thread obj1=new Thread(threadobj3);
        obj1.start();

        //multiple thread - 5 threads using for loop------->

        for (int i = 0; i < 5; i++) {
            multithread_runnableinterface threadobj4 = new multithread_runnableinterface(i);
            Thread obj2 = new Thread(threadobj4);
            System.out.println(obj2.isAlive()); //prints false(thread not started)
            obj2.start(); //starts current thread(becomes alive)
            System.out.println(obj2.isAlive()); //prints true( thread started)
            obj2.join(); // after current thread ends, starts next thread ------ add throws Exception for main method()
        }
    }
}
