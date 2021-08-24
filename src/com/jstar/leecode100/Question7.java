package com.jstar.leecode100;

/**
 * @author Jstar
 * @version 1.0
 * @date 2021/8/14 11:51 上午
 */
public class Question7 {
    class Solution {
        public int maxArea(int[] height) {
            int max = 0;
            int l = 0, r = height.length - 1;
            while(l < r) {
                int area = (r - l) * Math.min(height[l], height[r]);
                max = Math.max(max, area);
                if (height[l] < height[r]) {
                    l++;
                } else {
                    r--;
                }
            }

            return max;
        }
    }
}
