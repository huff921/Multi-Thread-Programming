package com.huff.javaMultiThreadProgramming.theSecondChapter.two_one.twoObjectTwoLock;

/**
 * @author huff
 * @date 2020/3/17 14:20
 */
public class ThreadA extends Thread {

    private HasSelfPrivateNum numRef;

    public ThreadA(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }
}
