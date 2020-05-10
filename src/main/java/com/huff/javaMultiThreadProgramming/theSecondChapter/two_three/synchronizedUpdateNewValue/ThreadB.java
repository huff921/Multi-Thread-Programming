package com.huff.javaMultiThreadProgramming.theSecondChapter.two_three.synchronizedUpdateNewValue;

/**
 * @author huff
 * @date 2020/3/18 18:28
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.stopMethod();
    }
}
