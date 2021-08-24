package com.jstar.leecode_api;

import java.util.Stack;

/**
 * @author Jstar
 * @version 1.0
 * @date 2021/7/10 12:26 下午
 */
public class StackApi {

    public static void test() {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        int size = stack.size();
        stack.peek();
        stack.pop();
        stack.push(2);
        boolean contains = stack.contains(2);
        boolean empty = stack.empty();
        stack.push(3);
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }


    public static void main(String[] args) {
        test();
    }
}
