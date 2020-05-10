package com.huff.javaMultiThreadProgramming.theThirdChapter.three_one.pipeReaderWriter;

import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.PipedWriter;

/**
 * @author huff
 * @date 2020/3/20 15:40
 */
public class WriteData {
    public void waiteMethod(PipedWriter out){
        try {
            System.out.println("write:");
            for (int i = 0; i < 300; i++) {
                String outData = ""+(i+1);
                out.write(outData);
                System.out.println(outData);
            }
            System.out.println();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
