package com.jstar.leecode100;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Jstar
 * @version 1.0
 * @date 2021/8/14 12:25 下午
 */
public class Question17 {
    static class Solution {
        public List<String> letterCombinations(String digits) {
            Map<Character, String> map = new HashMap<>();
            List<String> res = new LinkedList<>();
            map.put('2', "abc");
            map.put('3', "def");
            map.put('4', "ghi");
            map.put('5', "jkl");
            map.put('6', "mno");
            map.put('7', "pqrs");
            map.put('8', "tuv");
            map.put('9', "wxyz");
            if (digits.length() == 0) {
                return new LinkedList<>();
            }
            backTrack(map, res, 0, new StringBuilder(), digits);
            return res;
        }

        public static void backTrack(Map<Character, String> map, List<String> res, int index, StringBuilder stringBuilder, String digits) {
            if (index == digits.length()) {
                res.add(stringBuilder.toString());
                return;
            }
            String str = map.get(digits.charAt(index));

            for (int i = 0; i < str.length(); i++) {
                stringBuilder.append(str.charAt(i));
                backTrack(map, res, index + 1, stringBuilder, digits);
                stringBuilder.deleteCharAt(i);
            }

        }
    }

}
