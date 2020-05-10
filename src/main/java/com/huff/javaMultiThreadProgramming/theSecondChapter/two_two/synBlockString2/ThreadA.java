package com.huff.javaMultiThreadProgramming.theSecondChapter.two_two.synBlockString2;

import com.huff.javaMultiThreadProgramming.theSecondChapter.two_two.synBlockString.ThreadB;

/**
 * @author huff
 * @date 2020/3/17 17:30
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.a();
    }
}
