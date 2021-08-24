package com.jstar.conclusion;

/**
 * @author Jstar
 * @version 1.0
 * @date 2021/8/9 7:45 下午
 */
// "static void main" must be defined in a public class.

import java.util.LinkedList;
import java.util.List;

/**
     回溯算法就是树的遍历的两种使用前序遍历加后序遍历
     前序遍历是在进入节点前采取一些操作
     后序遍历就是在离开某个节点前进行一些操作
     void travel(TreeNode root) {
        for (TreeNode child : root.childern) {
        // 前序遍历的操作
        travel(child);
        //后序遍历的一些操作
        }
     }
     void backtrack() {

     // 递归结束条件,并将结果加入答案

        for choose in list:
            // 判断选择是否合法；不合法的话直接continue；结束，否则加入结果；
            res.add(choose);
            backtrack(choose, list)
            //撤销选择
             res.remove;
     }
 **/

public class BackTrack {

    //存放全排列的结果
    private static List<List<Integer>> res = new LinkedList<>();

    // 全排列问题
    public static void backTrack(int nums[], LinkedList<Integer> road) {

        // 递归结束条件,并保存答案
        if (nums.length == road.size()) {
            res.add(new LinkedList(road));
            return;
        }

        for (int num : nums) {
            if (road.contains(num)) {
                continue;
            }
            road.add(num);
            backTrack(nums, road);
            road.removeLast();
        }
    }

    public static void main(String[] args) {
        int nums[] = new int[]{1,2,3};
        LinkedList<Integer> road = new LinkedList();
        backTrack(nums, road);
        for (List list : res) {
            System.out.println(list);
        }
    }



}