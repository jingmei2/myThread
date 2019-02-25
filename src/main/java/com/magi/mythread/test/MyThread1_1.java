package com.magi.mythread.test;


/**
 * @author magi
 * 继承 Thread 类
 *
 */
public class MyThread1_1 extends Thread{
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
