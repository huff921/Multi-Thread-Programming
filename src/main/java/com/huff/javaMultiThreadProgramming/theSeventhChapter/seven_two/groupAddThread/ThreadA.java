package com.huff.javaMultiThreadProgramming.theSeventhChapter.seven_two.groupAddThread;

/**
 * @author huff
 * @date 2020/3/26 22:31
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()){
                System.out.println("ThreadName="+Thread.currentThread().getName());
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
