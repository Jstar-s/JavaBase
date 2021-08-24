package com.jstar.leecode_api;

import java.util.Scanner;

/**
 * @author Jstar
 * @version 1.0
 * @date 2021/7/9 12:34 下午
 */
public class ReadData {

    public static void main(String[] args) {

        //  read num separate by space  eg, int[]
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }

        // read by line eg, string
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            System.out.println(str);
        }
    }
}
