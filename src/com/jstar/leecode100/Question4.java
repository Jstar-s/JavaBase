package com.jstar.leecode100;

/**
 * @author Jstar
 * @version 1.0
 * @date 2021/8/12 2:18 下午
 */
public class Question4 {
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int len = nums1.length + nums2.length;
            int l1 = 0, l2 = 0;
            int mid = len / 2;
            int res[] = new int[len];
            int k = 0;
            while (l1 < nums1.length && l2 < nums2.length && k < mid + 1) {
                res[k++] = nums1[l1] <= nums2[l2] ? nums1[l1++] : nums2[l2++];
            }

            while (l1 < nums1.length && k < mid + 1) {
                res[k++] = nums1[l1++];
            }
            while (l2 < nums2.length && k < mid + 1) {
                res[k++] = nums2[l2++];
            }

            if (len % 2 == 0) {
                return ((double) res[mid] + res[mid-1]) / 2;
            } else {
                return (double) res[mid];
            }
        }
    }

    public static void main(String[] args) {
        for (int j = 1; j < 5; j++) {
            for (int i = 0; i < j; i++) {
                System.out.println(i +  " " + j);
            }
        }
    }

}
