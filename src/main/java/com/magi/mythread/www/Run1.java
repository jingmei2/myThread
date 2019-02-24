package com.magi.mythread.www;

import com.magi.mythread.test.MyThread1;

import java.util.Random;

/**
 * @author magi
 */
public class Run1 {
    private static Random random = new Random();

    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        myThread1.setName("myThread1");
        //myThread1.start();
        myThread1.run();

        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random()*1000);
                Thread.sleep(time);
                System.out.println("main="+Thread.currentThread().getName());
            }
        } catch (InterruptedException e){
            e.fillInStackTrace();
        }


    }

//      1.在子线程执行了 start 之后,说明线程准备就绪,等待调用线程的 run 方法,是交由给 Thread 随机安排任务的执行
//      2.在执行了 thread.run 方法的时候,其实是调用了主线程 mian 的 run 方法,此时代码执行是同步的,顺序的

//    run=myThread1
//            main=main
//    run=myThread1
//            run=myThread1
//    main=main
//            run=myThread1
//    run=myThread1
//            main=main
//    run=myThread1
//            main=main
//    run=myThread1
//            run=myThread1
//    main=main
//            run=myThread1
//    main=main
//            main=main
//    run=myThread1
//            main=main
//    main=main
//            main=main

//    run=main
//            run=main
//    run=main
//            run=main
//    run=main
//            run=main
//    run=main
//            run=main
//    run=main
//            run=main
//    main=main
//            main=main
//    main=main
//            main=main
//    main=main
//            main=main
//    main=main
//            main=main
//    main=main
//            main=main


}
