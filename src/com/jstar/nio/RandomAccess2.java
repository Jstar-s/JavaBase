package com.jstar.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author Jstar
 * @version 1.0
 * @date 2021/8/23 4:08 下午
 */
public class RandomAccess2 {


    public static void main(String[] args) {
        try (
                FileChannel inChannel = new FileInputStream("out.txt").getChannel();
                FileChannel outChannel = new FileOutputStream("out2.txt").getChannel();)

        {
            ByteBuffer buffer = ByteBuffer.allocate(2);
            int read = inChannel.read(buffer);

            while (read!= -1) {
                buffer.flip();
                outChannel.write(buffer);
                buffer.clear();
                read = inChannel.read(buffer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
