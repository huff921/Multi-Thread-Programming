package com.huff.javaMultiThreadProgramming.theSecondChapter.two_one.synNotExtends;

/**
 * @author huff
 * @date 2020/3/17 16:02
 */
public class MyThreadA extends Thread {
    private Sub sub;

    public MyThreadA(Sub sub) {
        super();
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}
