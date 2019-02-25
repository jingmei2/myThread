package com.magi.mythread.test;

/**
 * @author magi
 * 实例变量和线程安全,数据共享,线程安全
 * 顺序排队
 */
public class MyThread1_6 extends Thread{
    private int count = 5;

    @Override
    synchronized public void run() {
        super.run();
            count--;
            //此实例不要用 for 语句,因为使用同步后其他线程获不到运行的机会
        System.out.println("由"+ MyThread1_6.currentThread().getName()+"计算,count="+count);
    }

}
