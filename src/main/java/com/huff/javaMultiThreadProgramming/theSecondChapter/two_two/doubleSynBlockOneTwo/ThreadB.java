package com.huff.javaMultiThreadProgramming.theSecondChapter.two_two.doubleSynBlockOneTwo;

/**
 * @author huff
 * @date 2020/3/17 16:45
 */
public class ThreadB extends Thread {
    private ObjectService service;

    public ThreadB(ObjectService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethodB();
    }
}
