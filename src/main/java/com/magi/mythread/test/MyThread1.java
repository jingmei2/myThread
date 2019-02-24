package com.magi.mythread.test;

import java.io.PrintWriter;
import java.util.Random;

/**
 * @author magi
 */
public class MyThread1 extends Thread{
    @Override
    public void run() {
//        super.run();

        try {
            for (int i=0;i<10;i++){
                int time = (int) (Math.random()*1000);
                Thread.sleep(time);
                System.out.println("run="+Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.fillInStackTrace();
        }
    }

}
