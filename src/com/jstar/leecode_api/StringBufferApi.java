package com.jstar.leecode_api;

import java.util.Scanner;

/**
 * @author Jstar
 * @version 1.0
 * @date 2021/7/9 1:09 下午
 */
public class StringBufferApi {

    //String to StringBuffer
    public static void test() {
        StringBuffer buffer = new StringBuffer("qbc");
        System.out.println(buffer.toString());
        // append in StringBuffer
        buffer.append("adf");
        System.out.println(buffer);

        //delete charAt
        buffer.deleteCharAt(1);
        System.out.println(buffer.toString());

        //insert string in index;
        buffer.insert(3, "hello");
        System.out.println(buffer.toString());


        // reverse StringBuild
        buffer.reverse();
        System.out.println(buffer.toString());


        // modify  in specific  index
        buffer.setCharAt(1, 'A');
        System.out.println(buffer.toString());


    }

    public static void main(String[] args) {
        test();
        long x = 12;
        System.out.println(x);
        Scanner scanner = new Scanner(System.in);
    }


}
