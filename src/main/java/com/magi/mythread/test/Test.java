package com.magi.mythread.test;

public class Test {
    public static void main(String[] args) {
        //获取当前运行线程的名字,当前是在 main 主线程里
        System.out.println(Thread.currentThread().getName());
    }
}
