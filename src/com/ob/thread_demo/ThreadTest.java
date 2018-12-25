package com.ob.thread_demo;

/**
 * @author: oubin
 * @date: 2018/12/12 18:02
 * @Description:
 */
public class ThreadTest {

    public static void main(String[] args) {
        SyncThread s1 = new SyncThread();
        SyncThread s2 = new SyncThread();
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        t1.start();
        t2.start();

//        Thread t3 = new Thread(s1);
//        Thread t4 = new Thread(s1);
//        t3.start();
//        t4.start();
    }
}
