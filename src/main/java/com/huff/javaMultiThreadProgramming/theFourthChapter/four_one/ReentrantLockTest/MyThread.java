package com.huff.javaMultiThreadProgramming.theFourthChapter.four_one.ReentrantLockTest;

/**
 * @author huff
 * @date 2020/3/24 14:00
 */
public class MyThread extends Thread {
    private MyService service;

    public MyThread(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
