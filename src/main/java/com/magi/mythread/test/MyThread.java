package com.magi.mythread.test;

/**
 * @author magi
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }
}
