package com.jstar.leecode_api;

import java.util.HashMap;
import java.util.Map;


public class Question1 {

    public  static int  findOddNum(int[] arr) {
        int ret = -1;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                int occurTime = map.getOrDefault(num, 0) + 1;
                if (occurTime % 2 != 0) {
                    ret = num;
                }
                map.put(num, occurTime);
            }
        }

        return ret;
    }

    public static void main(String[] args) {

        int array[] = new int[]{1, 2, 3, 2, 3, 1, 3,3,1};
        int oddNum = findOddNum(array);
        System.out.println(oddNum);

    }

}
