package com.magi.mythread.test;

/**
 * @author magi
 * 使用继承 Thread 类的方式来开发多线程应用程序在设计上是有局限性的,因为 java 是单线程继承,不支持多继承
 * 实现 Runnable 接口
 */
public class MyRunable1_3 implements Runnable {

    public void run() {
        System.out.println("运行中");
    }
}
