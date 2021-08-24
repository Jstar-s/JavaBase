package com.jstar.leecode_api;

/**
 * @author Jstar
 * @version 1.0
 * @date 2021/7/29 4:40 下午
 */
public class Question3 {


    public static void process(int arr[], int left, int right) {
        if (left == right) {
            return;
        }
        int mid = left + ((right - left) >> 1);
        process(arr, left, mid);
        process(arr, mid + 1, right);
        merge(arr, left, mid, right);

    }

    public static void merge(int arr[], int left, int mid, int right) {
        int help[] = new int[right -left + 1];
        int i = 0;
        int lp = left;
        int rp = mid  + 1;
        while (lp <= mid && rp <= right) {
            help[i++] = arr[lp] > arr[rp] ? arr[rp++] : arr[lp++];
        }
        while (lp <= mid) {
            help[i++] = arr[lp++];
        }
        while (rp <= right) {
            help[i++] = arr[rp++];
        }
        for (int j = 0; j < right - left + 1; j++) {
            arr[left+j] = help[j];
        }
    }

    public static void mergeSort(int arr[]) {
        process(arr, 0, arr.length -1);
    }

    public static int[] minK(int arr[], int k) {
        mergeSort(arr);
        int ret[] = new int[k];
        for (int i = 0; i < k; i++) {
            ret[i] = arr[i];
        }
        return ret;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{10, 12, 24, 13, 14, 1, 8};
        int[] rets = minK(arr, 4);
        for (int i = 0; i < rets.length; i++) {
            System.out.println(rets[i]);
        }
    }
}
