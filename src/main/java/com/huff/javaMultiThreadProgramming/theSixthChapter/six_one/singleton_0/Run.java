package com.huff.javaMultiThreadProgramming.theSixthChapter.six_one.singleton_0;

/**
 * @author huff
 * @date 2020/3/24 21:17
 */
public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
