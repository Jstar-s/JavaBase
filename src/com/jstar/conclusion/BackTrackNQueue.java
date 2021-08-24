package com.jstar.conclusion;

import javax.crypto.interfaces.PBEKey;
import java.util.*;

/**
 * @author Jstar
 * @version 1.0
 * @date 2021/8/9 7:57 下午
 */




public class BackTrackNQueue {

    private static List<String> res = new LinkedList<>();


    public static void backTravel(char board[][], int row) {
        if (row == board[0].length) {
            for (int i = 0; i < board[0].length; i++) {
                for (int j = 0; j < board[1].length; j++) {
                    System.out.print(board[i][j] + "   ");
                }
                System.out.println();
            }
            System.out.println("--------------------------");
            String string = Arrays.deepToString(board);
//            System.out.println(string);
            res.add(string);
            return;
        }
        int n = board[1].length;
        for (int col = 0; col < n; col++) {
            if (!isValid(board, row, col)) {
                continue;
            }
            board[row][col] = 'Q';
            backTravel(board, row + 1);
            board[row][col] = '.';
        }
    }

    private static boolean isValid(char[][] board, int row, int col) {
        int n = board[1].length;

        // 判断正上方有没有Q
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // 检查左上方有没有Q
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // 检查右上方有没有Q
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        char board[][] = new char[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                board[i][j] = '.';
            }
        }
        backTravel(board, 0);


        }


}
