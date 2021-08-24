package com.jstar.leecode_api;

import com.jstar.conclusion.BackTrack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;

/**
 * @author Jstar
 * @version 1.0
 * @date 2021/8/9 9:40 下午
 */
public class bfs_minStep {


    private static Queue<Character> queue = new LinkedList<>();
    private static int minStep = Integer.MAX_VALUE;


    private static int directions[] = new int[]{-1,0,1,0,-1};




    public static void main(String[] args) {
        char board[][] =  new  char[3][3];
        board[0] = new char[]{'.', '#', '#'};
        board[1] = new char[]{'.', '#', '#'};
        board[2] = new char[]{'#', '#', '.'};
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board[1].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        int m = board.length;
        int n = board[0].length;
        Queue<int[]> queue  = new LinkedList<>();
        boolean visited[][][] = new boolean[m][n][m * n];
        visited[0][0][0] = true;
        queue.add(new int[]{0, 0, 0});
        int step = 0;

        while (!queue.isEmpty()) {
            step++;
            int size = queue.size();
            while (size-- > 0) {
                int cur[] = queue.poll();
                int i = cur[0];
                int j = cur[1];
                int k = cur[2];

                for (int d = 0; d < 4; d++) {
                    int x = i + directions[d];
                    int y = j + directions[d + 1];
                    if (x >= 0 && y >= 0 && x < m && y < n) {
                        if (board[x][y] == '.' && !visited[x][y][k]) {
                            if (x == m - 1 && y == n - 1) {
                                minStep = Math.min(minStep, k);
                                System.out.println(minStep + " " + step);
                            } else {
                                visited[x][y][k] = true;
                                queue.add(new int[]{x, y, k});
                            }
                        }else if (board[x][y] == '#' && k < m * n  - 2 && !visited[x][y][k+1]) {
                            visited[x][y][k+1] = true;
                            queue.add(new int[]{x, y, k + 1});
                        }
                    }
                }
            }

        }
        System.out.println(minStep);

    }



}
