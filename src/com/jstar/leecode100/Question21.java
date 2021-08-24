//package com.jstar.leecode100;
//
//import java.util.Calendar;
//
///**
// * @author Jstar
// * @version 1.0
// * @date 2021/8/17 1:36 下午
// */
//public class Question21 {
//    public class ListNode {
//        int val;
//        Question2.ListNode next;
//        ListNode() {}
//        ListNode(int val) { this.val = val; }
//        ListNode(int val, Question2.ListNode next) { this.val = val; this.next = next; }
//    }
//
//    class Solution {
//        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//            if (l1 == null || l2 == null) {
//                return l1 == null ? l2 : l1;
//            }
//            ListNode ans = new ListNode(0);
//            ListNode res = ans;
//            while (l1 != null && l2 != null) {
//                if (l1.val <= l2.val) {
//                    res.next = new ListNode(l1.val);
//                    res = res.next;
//                    l1 = l1.next;
//                } else {
//                    res.next = new ListNode(l2.val);
//                    res = res.next;
//                    l2 = l2.next;
//                }
//            }
//
//            while (l1 != null) {
//                res.next = new ListNode(l1.val);
//                res = res.next;
//                l1 = l1.next;
//            }
//
//            while (l2 != null) {
//                res.next = new ListNode(l2.val);
//                res = res.next;
//                l2 = l2.next;
//            }
//            return ans.next;
//        }
//    }
//}
