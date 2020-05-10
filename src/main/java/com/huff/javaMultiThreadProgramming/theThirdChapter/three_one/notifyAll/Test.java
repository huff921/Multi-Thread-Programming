package com.huff.javaMultiThreadProgramming.theThirdChapter.three_one.notifyAll;

/**
 * @author huff
 * @date 2020/3/19 16:50
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Object lock=new Object();
        ThreadA a=new ThreadA(lock);
        a.start();
        ThreadB b=new ThreadB(lock);
        b.start();
        ThreadC c=new ThreadC(lock);
        c.start();
        Thread.sleep(1000);
        NotifyThread notifyThread=new NotifyThread(lock);
        notifyThread.start();
    }
}
