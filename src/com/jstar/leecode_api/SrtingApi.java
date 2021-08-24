package com.jstar.leecode_api;

import java.util.Collections;
import java.util.LinkedList;

/**
 * @author Jstar
 * @version 1.0
 * @date 2021/7/9 1:03 下午
 */
public class SrtingApi {

    // object, char[], int to string
    public static void test() {
        Object o = new Object();
        String str = String.valueOf(o);
        char[] s = new char[]{'a','b','c'};
        String str1 = String.valueOf(s);
        String str2 = String.valueOf(2);
        System.out.println(str + " " + str1 + " " + str2 + " ");
    }


    public static void main(String[] args) {
        test();
    }
}
