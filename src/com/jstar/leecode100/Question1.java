package com.jstar.leecode100;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jstar
 * @version 1.0
 * @date 2021/8/12 12:45 上午
 */
public class Question1 {


    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(target - nums[i])) {
                    return new int[]{map.get(target - nums[i]), i};
                }
                map.put(nums[i], i);
            }
            return new int[]{0,0};
        }
    }



}
