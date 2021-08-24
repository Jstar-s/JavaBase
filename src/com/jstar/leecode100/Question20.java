package com.jstar.leecode100;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Jstar
 * @version 1.0
 * @date 2021/8/16 5:16 下午
 */
public class Question20 {

    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            Map<Character, Character> map = new HashMap<>();
            map.put(')', '(');
            map.put(']', '[');
            map.put('}', '{');
            int n = s.length();
            if (n % 2 != 0) {
                return false;
            }
            char[] chars = s.toCharArray();
            for (char c : chars) {
                if (map.containsKey(c)) {
                    if (stack.isEmpty() || stack.pop() != map.get(c)) {
                        return false;
                    }
                } else {
                    stack.push(c);
                }
            }
            if (stack.isEmpty()) {
                return true;
            }
            return  false;
        }
    }



}
