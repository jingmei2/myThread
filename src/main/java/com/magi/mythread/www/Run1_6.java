package com.magi.mythread.www;

import com.magi.mythread.test.MyThread1_5;
import com.magi.mythread.test.MyThread1_6;

/**
 * @author magi
 * 共享数据,产生线程安全的问题
 */
public class Run1_6 {
    public static void main(String[] args) {
        //Thread 构造函数
        MyThread1_6 thread = new MyThread1_6();
        Thread a = new Thread(thread,"A");
        Thread b = new Thread(thread,"B");
        Thread c = new Thread(thread,"C");
        Thread d = new Thread(thread,"D");
        Thread e = new Thread(thread,"E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();

//        由A计算,count=4
//        由D计算,count=3
//        由C计算,count=2
//        由B计算,count=1
//        由E计算,count=0

    }
}
