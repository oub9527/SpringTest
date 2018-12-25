package com.ob.thread_demo;

/**
 * @author: oubin
 * @date: 2018/12/12 18:01
 * @Description:
 */
public class SyncThread implements Runnable {

    private int x = 0;

    @Override
    public void run() {
        while (x < 10) {

            synchronized (SyncThread.class) {
                System.out.println(Thread.currentThread().getName() + "   " + x ++);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }


}
