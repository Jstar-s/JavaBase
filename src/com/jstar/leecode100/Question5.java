package com.jstar.leecode100;

/**
 * @author Jstar
 * @version 1.0
 * @date 2021/8/12 6:26 下午
 */
public class Question5 {
    class Solution {
        public String longestPalindrome(String s) {
            int len = s.length();
            int max = 1, start = 0;
            boolean dp[][] = new boolean[len][len];
            for (int j = 0; j < len; j++) {
                for (int i = 0; i <= j; i++) {
                    if (j - i < 2) {
                        dp[i][j] = s.charAt(i) == s.charAt(j);
                    } else {
                        dp[i][j] = dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j);
                    }
                    if (j - i + 1 > max && dp[i][j]) {
                        max = j - i + 1;
                        start = i;
                    }
                }

            }
            return s.substring(start,start + max);
        }
    }
}
