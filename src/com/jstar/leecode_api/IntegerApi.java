package com.jstar.leecode_api;

import com.sun.xml.internal.bind.v2.runtime.output.DOMOutput;

/**
 * @author Jstar
 * @version 1.0
 * @date 2021/7/9 12:40 下午
 */
public class IntegerApi {

    private static void test() {
        // turn string to int
        String string = "123";
        int num = Integer.parseInt(string);
        System.out.println(num);
    }

    // turn stringof binary to  int
    private static void test1() {
        // turn string to int
        String string2 = "10110111";
        int i = Integer.parseInt(string2, 2);
        System.out.println(i);
    }



    public static void main(String[] args) {
        test();
        test1();
    }
}
