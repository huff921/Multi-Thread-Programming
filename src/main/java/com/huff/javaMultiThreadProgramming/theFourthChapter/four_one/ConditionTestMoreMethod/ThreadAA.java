package com.huff.javaMultiThreadProgramming.theFourthChapter.four_one.ConditionTestMoreMethod;

/**
 * @author huff
 * @date 2020/3/24 14:07
 */
public class ThreadAA extends Thread {
    private MyService service;

    public ThreadAA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodA();
    }
}
