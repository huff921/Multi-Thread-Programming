package com.huff.javaMultiThreadProgramming.theSecondChapter.two_two.t8;

import com.huff.javaMultiThreadProgramming.theFristChapter.one_two.t3.MyThread;

/**
 * @author huff
 * @date 2020/3/17 16:51
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        MyThread1 thread1=new MyThread1(task);
        thread1.start();
        Thread.sleep(100);
        MyThread2 thread2 = new MyThread2(task);
        thread2.start();
    }
}
