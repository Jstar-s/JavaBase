package com.jstar.nio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/**
 * @author Jstar
 * @version 1.0
 * @date 2021/8/23 4:28 下午
 */
public class RandomAccess3 {

    public static void main(String[] args) {

        File file = new File("out.txt");

        try (
                RandomAccessFile raf = new RandomAccessFile(file, "rw");
                FileChannel inChannel = raf.getChannel();
                final FileChannel outChannel = new FileOutputStream("out3.txt").getChannel();

        ){
            inChannel.transferTo(0, file.length(), outChannel);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
