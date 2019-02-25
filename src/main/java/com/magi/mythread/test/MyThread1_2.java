package com.magi.mythread.test;

/**
 * @author magi
 * 线程具有随机性
 */
public class MyThread1_2 extends Thread{
    private int i;

    public MyThread1_2(int i){
        super();
        this.i = i;
    }
    @Override
    public void run() {
        System.out.println("i="+i);

    }

}
