package com.jstar.nio;

import jdk.jfr.internal.tool.Main;

import java.nio.Buffer;
import java.nio.CharBuffer;

/**
 * @author Jstar
 * @version 1.0
 * @date 2021/8/23 10:42 上午
 */




public class NioTest {

    public static void testBuffer() {
        CharBuffer charBuffer = CharBuffer.allocate(16);
        charBuffer.put("abcdefg1234567");

        System.out.println("position: " + charBuffer.position());
        char array[] = new char[4];

        StringBuilder stringBuilder = new StringBuilder();
        charBuffer.flip();
        System.out.println("position: " + charBuffer.position());

        while (charBuffer.hasRemaining()) {
            int len  = Math.min(charBuffer.remaining(), array.length);
            charBuffer.get(array, 0, len);
            for (int i = 0; i < len; i++) {
                stringBuilder.append(array[i]);
            }
        }
        System.out.println(stringBuilder.toString());
    }


    public static void main(String[] args) {
        testBuffer();

    }


}
