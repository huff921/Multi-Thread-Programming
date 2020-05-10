package com.huff.javaMultiThreadProgramming.theSecondChapter.two_two.t7;

/**
 * @author huff
 * @date 2020/3/17 16:36
 */
public class MyThread1 extends  Thread {
    private Task task;

    public MyThread1(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
