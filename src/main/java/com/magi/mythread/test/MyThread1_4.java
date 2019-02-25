package com.magi.mythread.test;

/**
 * @author magi
 * 实例变量和线程安全,数据不共享
 */
public class MyThread1_4 extends Thread{
    private int count = 5;

    public MyThread1_4(String name){
        super();
        //设置线程名称
        this.setName(name);
    }
    @Override
    public void run() {
        //看super.run的位置
        super.run();
        while (count>0){
            count--;
            System.out.println("由"+MyThread1_4.currentThread().getName()+"计算,count="+count);
        }


    }

}
