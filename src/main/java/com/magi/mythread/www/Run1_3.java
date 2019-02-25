package com.magi.mythread.www;

import com.magi.mythread.test.MyRunable1_3;

public class Run1_3 {
    public static void main(String[] args) {
        //Thread 构造函数
        Runnable runnable = new MyRunable1_3();
        Thread thread = new Thread(runnable);
        thread.start();

        System.out.println("main运行结束!");

//        main运行结束!
//                运行中


    }
}
