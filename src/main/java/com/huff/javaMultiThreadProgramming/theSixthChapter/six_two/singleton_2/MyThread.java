package com.huff.javaMultiThreadProgramming.theSixthChapter.six_two.singleton_2;

import com.huff.javaMultiThreadProgramming.theSixthChapter.six_two.singleton_2_1.MyObject;

/**
 * @author huff
 * @date 2020/3/24 21:27
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
