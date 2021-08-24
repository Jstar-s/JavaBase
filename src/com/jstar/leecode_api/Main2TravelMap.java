package com.jstar.leecode_api;

import java.util.Scanner;

/**
 * @author Jstar
 * @version 1.0
 * @date 2021/8/1 10:39 上午
 */
public class Main2TravelMap {

    public static int direct[] = new int[]{0,1,0,-1,0};
    public static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[][] maps = new char[n][m];
        for (int i = 0; i < n; i++) {
            maps[i] = (scanner.next()).toCharArray();
        }




    }
}
