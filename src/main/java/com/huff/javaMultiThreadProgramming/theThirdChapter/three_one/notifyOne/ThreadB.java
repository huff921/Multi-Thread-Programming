package com.huff.javaMultiThreadProgramming.theThirdChapter.three_one.notifyOne;

/**
 * @author huff
 * @date 2020/3/19 16:48
 */
public class ThreadB extends Thread {
    private Object lock;

    public ThreadB(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service=new Service();
        service.testMethod(lock);
    }
}
