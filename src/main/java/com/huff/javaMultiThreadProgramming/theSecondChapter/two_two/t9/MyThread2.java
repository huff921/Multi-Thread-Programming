package com.huff.javaMultiThreadProgramming.theSecondChapter.two_two.t9;

/**
 * @author huff
 * @date 2020/3/18 0:20
 */
public class MyThread2 extends Thread {
    private MyOneList list;

    public MyThread2(MyOneList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        MyService msRef = new MyService();
        msRef.addServiceMethod(list,"B");
    }
}
