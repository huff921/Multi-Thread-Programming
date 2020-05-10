package com.huff.javaMultiThreadProgramming.theSecondChapter.two_one.throwExceptionNoLock;

/**
 * @author huff
 * @date 2020/3/17 15:53
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod();
    }
}
