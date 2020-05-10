package com.huff.javaMultiThreadProgramming.theFristChapter.one_ten.t20;

import java.util.Random;

/**
 * @author huff
 * @date 2020/3/16 15:44
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            random.nextInt();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("☆  ☆  ☆  ☆  ☆ thread 2 use time="+(endTime-beginTime));
    }
}