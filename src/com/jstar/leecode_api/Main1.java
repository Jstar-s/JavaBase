package com.jstar.leecode_api;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Jstar
 * @version 1.0
 * @date 2021/7/31 8:07 下午
 */
public class Main1 {

//    public static int num = 0;
//
//    public static void swap(int cups[], int a, int b) {
//            int c = cups[a];
//            cups[a] = cups[b];
//            cups[b] = c;
//            if (cups[a] == 100) {
//                num = a;
//            } else if (cups[b] == 100) {
//                num = b;
//            }
//    }
//
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int N, X, K;
//        N = scanner.nextInt();
//        X = scanner.nextInt();
//        K = scanner.nextInt();
//
//
//        int cups[] = new int[N+5];
//        Arrays.fill(cups, 0);
//        num = X;
//        cups[X] = 100;
//
//        // 交换K次
//        int a = 0, b = 0;
//        for (int i = 0; i < K; i++) {
//            a = scanner.nextInt();
//            b = scanner.nextInt();
//            swap(cups, a, b);
//        }
//        System.out.println(num);
//
//    }

    public static int direct[] = new int[]{0,1,0,-1,0};
    public static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("k1",1);
        map.put("k1", 2);
        System.out.println(map.get("k1"));
        //这里main函数中的base比如指向内存477
        Base base = new Base(3);
        test(base);
        //回到主函数后base还是指向477
        System.out.println(base.getA());


    }


    //这里如果换成别的名字更好理解，   取base有点迷惑性
    public static String test(Base base) {
        base.setA(2);// 这里也是指向477
        base = new Base(4); // 这里指向了478
        System.out.println(base.getA());  // 得到的时478的值
        return "";

    }


    public static class Base{
        private int a;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public Base(int a) {
            this.a = a;
        }
    }
}
