package com.jstar.leecode100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Jstar
 * @version 1.0
 * @date 2021/8/14 12:00 下午
 */
public class Question15 {

    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> res = new LinkedList<>();
            Arrays.sort(nums);

            for (int first  = 0; first < nums.length; first++) {
                if (nums[first] > 0) {
                    break;
                }
                if ( first > 0 && nums[first-1] == nums[first] ) {
                    continue;
                }
                int target = -nums[first];
                int second = first + 1;
                int third = nums.length - 1;
                while (second < third) {

                    if (nums[second] + nums[third] < target) {
                        second++;
                    } else if (nums[second] + nums[third] > target) {
                        third--;
                    } else {
                        res.add(new ArrayList<>(Arrays.asList(nums[first], nums[second], nums[third])));
                        second++;
                        third--;
                        while (nums[second-1] == nums[second] && second < third) {
                            second++;
                        }
                        while (nums[third+1] == nums[third] && second < third) {
                            third--;
                        }
                    }
                }
            }
            return res;
        }
    }

}
