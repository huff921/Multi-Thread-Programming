package com.huff.javaMultiThreadProgramming.theFourthChapter.four_one.ConditionTestManyToMany;

/**
 * @author huff
 * @date 2020/3/24 15:45
 */
public class MyThreadB extends Thread {
    private MyService service;

    public MyThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            service.get();
        }
    }
}
