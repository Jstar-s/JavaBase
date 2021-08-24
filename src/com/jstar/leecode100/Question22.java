package com.jstar.leecode100;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Jstar
 * @version 1.0
 * @date 2021/8/18 4:59 下午
 */
public class Question22 {

    class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> list = new LinkedList<>();
            backTrack(list, new StringBuilder(), 0, 0, n);
            return list;
        }

        public void backTrack(List<String> list, StringBuilder cur, int left, int right, int n) {
            if (cur.length() == 2 * n) {
                list.add(cur.toString());
            }

            if (left < n) {
                cur.append('(');
                backTrack(list, cur, left + 1, right, n);
                cur.deleteCharAt(cur.length() - 1);
            }
            if (right < left) {
                cur.append(')');
                backTrack(list, cur, left, right + 1 , n);
                cur.deleteCharAt(cur.length() - 1);
            }
        }
    }
}
