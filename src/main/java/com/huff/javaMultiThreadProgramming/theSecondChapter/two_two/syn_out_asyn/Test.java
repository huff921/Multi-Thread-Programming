package com.huff.javaMultiThreadProgramming.theSecondChapter.two_two.syn_out_asyn;

import com.huff.javaMultiThreadProgramming.theSecondChapter.two_two.synBlockString2.ThreadA;

/**
 * @author huff
 * @date 2020/3/18 0:09
 */
public class Test {
    public static void main(String[] args) {
        MyList myList = new MyList();
        MyThreadA a=new MyThreadA(myList);
        a.setName("A");
        a.start();
        MyThreadB b= new MyThreadB(myList);
        b.setName("B");
        b.start();
    }
}
