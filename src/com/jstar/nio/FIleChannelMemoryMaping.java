package com.jstar.nio;

import org.jcp.xml.dsig.internal.SignerOutputStream;

import javax.xml.stream.XMLOutputFactory;
import java.io.*;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/**
 * 将文件所有数据映射到虚拟内存中，再通过FileChannel进行读取和保存，这种方式可以提高文件访问效率
 * @author Jstar
 * @version 1.0
 * @date 2021/8/23 2:37 下午
 *
 */
public class FIleChannelMemoryMaping {





    public static void main(String[] args) throws IOException {
        File file = new File("src/com/jstar/nio/FIleChannelMemoryMaping.java");
        try (
            FileInputStream fileInputStream = new FileInputStream(file);
            FileChannel inChannel = fileInputStream.getChannel();
            FileOutputStream fileOutputStream = new FileOutputStream("out.txt");
            FileChannel outChannel = fileOutputStream.getChannel();
        ) {
            // 将inChannle中的文件映射到虚拟内存中去
            MappedByteBuffer map = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, file.length());
            // 将缓存区中数据传输到outChannel
            outChannel.write(map);
            map.flip();
            Charset charset = Charset.defaultCharset();
            CharBuffer decode = charset.decode(map);
            System.out.println(decode);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        File file = new File("out.txt");
//        RandomAccessFile raf = new RandomAccessFile(file, "rw");
//
//        FileChannel channel = raf.getChannel();
//
//        System.out.println("begin");
//        MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_WRITE, 0, file.length());
//        channel.position(file.length());
//        System.out.println("end");
//        channel.write(map);
//        channel.close();
//        raf.close();




    }
}
