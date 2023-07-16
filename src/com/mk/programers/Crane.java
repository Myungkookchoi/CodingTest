package com.mk.programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Crane {
    public static void main(String[] args) {
        // 4 3 1 1 3 2 4
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;

        List<Integer> temp = new ArrayList<>();
        for (int i : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][i - 1] != 0) {
                    temp.add(board[j][i - 1]);
                    if (temp.size() > 1) {
                        if (temp.get(temp.size() - 1) == temp.get(temp.size() - 2)) {
                            temp.remove(temp.size() - 1);
                            temp.remove(temp.size() - 1);
                            answer++;
                        }
                    }
                    board[j][i - 1] = 0;
                    break;
                }
            }
        }

        System.out.println(temp);

        return answer * 2;
    }
}
