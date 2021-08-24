package com.jstar.leecode100;

/**
 * @author Jstar
 * @version 1.0
 * @date 2021/8/12 12:33 上午
 */
public class Question2 {

    public class ListNode {
        int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode ret = res;
        int flag = 0;
        while(l1 != null && l2 != null) {
            int temp = l1.val + l2.val + flag;
            if (temp / 10 != 0) {
                flag = 1;
            } else {
                flag = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
            ret.next = new ListNode(temp % 10);
            ret = ret.next;
        }

        while (l1 != null) {
            int temp = l1.val + flag;
            ret.next = new ListNode(temp % 10);
            l1 = l1.next;
            flag  = temp / 10;
            ret = ret.next;
        }
        while(l2 != null) {
            int temp = l2.val + flag;
            ret.next = new ListNode(temp % 10);
            l2 = l2.next;
            flag  = temp / 10;
            ret = ret.next;
        }
        if (flag == 1) {
            ret.next = new ListNode(1);
        }
        return res.next;
    }


}
