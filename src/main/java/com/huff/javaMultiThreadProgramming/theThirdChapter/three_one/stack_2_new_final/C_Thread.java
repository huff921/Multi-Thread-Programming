package com.huff.javaMultiThreadProgramming.theThirdChapter.three_one.stack_2_new_final;

/**
 * @author huff
 * @date 2020/3/20 15:18
 */
public class C_Thread extends Thread {

    private C c;

    public C_Thread(C c) {
        super();
        this.c = c;
    }

    @Override
    public void run() {
        while (true){
            c.popService();
        }
    }
}
