package com.huff.javaMultiThreadProgramming.theSecondChapter.two_two.synTwoLock;

/**
 * @author huff
 * @date 2020/3/18 1:08
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.printA();
    }
}
