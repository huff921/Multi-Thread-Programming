package com.huff.javaMultiThreadProgramming.theFourthChapter.four_one.lockMethodTest3.test2;

/**
 * @author huff
 * @date 2020/3/24 16:59
 */

public class Run {
    public static void main(String[] args) {
        final Service service1 = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service1.serviceMethod();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

    }
}
