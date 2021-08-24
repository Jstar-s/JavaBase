package com.jstar.conclusion;

/**
 * @author Jstar
 * @version 1.0
 * @date 2021/8/10 4:23 下午
 */


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 滑动窗口，不固定窗口的长度，根据是否包含所以t来判断是否更新答案
 */
public class MinCoverString {




    public static void main(String[] args) {
        String S = "ADBECFEBANC";
        String T = "ABC";
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        char[] t = T.toCharArray();
        char[] s = S.toCharArray();

        for (char c : t) {
            need.put(c, need.getOrDefault(c, 0)+ 1);
        }
        int valid = 0;
        int left = 0, right = 0;
        int start = 0, len = Integer.MAX_VALUE;
        while (right < s.length) {
            char c = s[right];
            right++;
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (need.get(c) == window.get(c)) {
                    valid++;
                }
            }

            while (valid == need.size()) {
                // 更新长度
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }
                char d = s[left];
                left++;
                if (need.containsKey(d)) {
                    if (window.get(d) == need.get(d)) {
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);

                }
            }
        }
        System.out.println(s[start]);
        System.out.println(S.substring(start, start + len));

    }
}
