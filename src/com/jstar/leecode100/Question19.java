//package com.jstar.leecode100;
//
//
//import java.util.List;
//
///**
// * @author Jstar
// * @version 1.0
// * @date 2021/8/16 4:20 下午
// */
//public class Question19 {
//
//
//    /**
//     * Definition for singly-linked list.
//     * public class ListNode {
//     *     int val;
//     *     ListNode next;
//     *     ListNode() {}
//     *     ListNode(int val) { this.val = val; }
//     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//     * }
//     */
//    public class ListNode {
//        int val;
//        Question2.ListNode next;
//        ListNode() {}
//        ListNode(int val) { this.val = val; }
//        ListNode(int val, Question2.ListNode next) { this.val = val; this.next = next; }
//    }
//
//
//    class Solution {
//        public ListNode removeNthFromEnd(ListNode head, int n) {
//            ListNode first =  head;
//            ListNode second = head;
//            if (first.next == null) {
//                return  null;
//            }
//
//            for(int i = 1;  i <= n; i++) {
//                first = first.next;
//            }
//
//            // 考虑倒数第n个是头节点的情况
//            if (first == null) {
//                return head.next;
//            }
//            while (first.next != null) {
//                first =first.next;
//                second = second.next;
//            }
//
//            second.next = second.next.next;
//            return head;
//        }
//    }
//
//
//}
