package com.huff.javaMultiThreadProgramming.theFourthChapter.four_one.MustUseMoreCondition_OK;

/**
 * @author huff
 * @date 2020/3/24 15:36
 */
public class ThreadA extends Thread {
    private MyService myService;

    public ThreadA(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.awaitA();
    }
}
