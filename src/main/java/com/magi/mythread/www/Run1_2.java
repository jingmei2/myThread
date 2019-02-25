package com.magi.mythread.www;

import com.magi.mythread.test.MyThread;
import com.magi.mythread.test.MyThread1_2;

public class Run1_2 {
    public static void main(String[] args) {
        //执行 start 的方法的顺序不代表线程启动的顺序.
        MyThread1_2 myThread1 = new MyThread1_2(1);
        MyThread1_2 myThread2 = new MyThread1_2(2);
        MyThread1_2 myThread3 = new MyThread1_2(3);
        MyThread1_2 myThread4 = new MyThread1_2(4);
        MyThread1_2 myThread5 = new MyThread1_2(5);
        MyThread1_2 myThread6 = new MyThread1_2(6);
        MyThread1_2 myThread7 = new MyThread1_2(7);
        MyThread1_2 myThread8 = new MyThread1_2(8);
        MyThread1_2 myThread9 = new MyThread1_2(9);
        MyThread1_2 myThread10 = new MyThread1_2(10);
        MyThread1_2 myThread11 = new MyThread1_2(11);
        MyThread1_2 myThread12 = new MyThread1_2(12);
        MyThread1_2 myThread13 = new MyThread1_2(13);

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread5.start();
        myThread6.start();
        myThread7.start();
        myThread8.start();
        myThread9.start();
        myThread10.start();
        myThread11.start();
        myThread12.start();
        myThread13.start();

        System.out.println("main运行结束!");


//        main运行结束!
//        MyThread


//        i=1
//        i=4
//        i=5
//        i=3
//        i=2
//        i=6
//        i=7
//        i=8
//        i=9
//        i=10
//        i=11
//        i=12
//        main运行结束!
//                i=13

    }
}
