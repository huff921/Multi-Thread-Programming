package com.huff.javaMultiThreadProgramming.theThirdChapter.three_three.ThreadLocalTest;

/**
 * @author huff
 * @date 2020/3/20 17:39
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                Tools.t1.set("ThreadA"+(i+1));
                System.out.println("ThreadA get value="+Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
