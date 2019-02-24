package com.magi.mythread.www;

import com.magi.mythread.test.MyThread;

public class Run {
    public static void main(String[] args) {
        //这里是开启了线程的子任务,子线程和 mian 主线程执行顺序随机.
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("main运行结束!");


//        main运行结束!
//        MyThread
    }
}
