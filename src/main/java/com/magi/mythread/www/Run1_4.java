package com.magi.mythread.www;


import com.magi.mythread.test.MyThread1_4;

public class Run1_4 {
    public static void main(String[] args) {
        //Thread 构造函数
        MyThread1_4 a = new MyThread1_4("a");
        MyThread1_4 b = new MyThread1_4("b");
        MyThread1_4 c = new MyThread1_4("c");
        a.start();
        b.start();
        c.start();

//        由b计算,count=4
//        由a计算,count=4
//        由c计算,count=4
//        由a计算,count=3
//        由b计算,count=3
//        由a计算,count=2
//        由c计算,count=3
//        由a计算,count=1
//        由b计算,count=2
//        由b计算,count=1
//        由b计算,count=0
//        由a计算,count=0
//        由c计算,count=2
//        由c计算,count=1
//        由c计算,count=0

    }
}
