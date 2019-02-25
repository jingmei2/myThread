package com.magi.mythread.test;

import com.magi.controller.LoginServlet;

/**
 * @author magi
 * 登陆线程
 */
public class MyThread1_7 extends Thread{

    @Override
    public void run() {
        super.run();
        LoginServlet.doPost("a", "aaa");
    }

}
