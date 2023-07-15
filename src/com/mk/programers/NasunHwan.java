package com.mk.programers;

import java.util.Arrays;

public class NasunHwan {
    public static void main(String[] args) {
        int[][] asdf = solution(2);
        for (int[] i : asdf) {
            System.out.println(Arrays.toString(i));
        }
    }

    private static int[][] answer;
    private static int input = 1;
    private static int lastX = 0;
    private static int lastY = 0;

    static void drawList(int lastYy, int lastXx, int settingY, int settingX, int list) {
        for (int index = 0; index < list; index++) {
            answer[lastY][lastX] = input;
            lastX = lastX + lastXx;
            lastY = lastY + lastYy;
            input++;
        }
        lastX = lastX + settingX;
        lastY = lastY + settingY;
    }

    public static int[][] solution(int n) {
        answer = new int[n][n];
        int[] list = new int[n == 1 ? 1 : ((n - 1) * 2) + 1];
        list[list.length - 1] = 1;
        int listTemp = 1;
        for (int i = list.length; i > 0; i--) {
            list[i - 1] = listTemp;
            if (i % 2 == 0 && i != list.length) {
                listTemp++;
            }
        }
        for (int i = 0; i < list.length; i++) {
            if (i % 4 == 0) {   //  오른쪽
                drawList(0, 1, 1, -1, list[i]);
            }
            if (i % 4 == 1) {   // 아래
                drawList(1, 0, -1, -1, list[i]);
            }
            if (i % 4 == 2) {   // 왼쪽
                drawList(0, -1, -1, 1, list[i]);
            }
            if (i % 4 == 3) {   // 위
                drawList(-1, 0, 1, 1, list[i]);
            }
        }

        return answer;
    }
}
