package com.jstar.leecode100;

/**
 * @author Jstar
 * @version 1.0
 * @date 2021/8/12 12:47 上午
 *
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question3 {

    class Solution {

        public int lengthOfLongestSubstring(String s) {
            int check[] = new int[128];
            int left = 0, right = 0;
            int count = 0;
            while (right < s.length()) {
                char c = s.charAt(right);
                right++;
                check[c]++;

                while (check[c] > 1) {
                    char d = s.charAt(left);
                    check[d]--;
                    left++;
                }
                count = Math.max(count, right - left);
            }
            return count;
        }
    }

}
