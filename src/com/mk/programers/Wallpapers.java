package com.mk.programers;

import java.util.Arrays;

public class Wallpapers {

    static int[] save(int[] want, int x, int y) {
        int[] returnArray = new int[want.length + 2];
        for (int i = 0; i < want.length; i++) {
            returnArray[i] = want[i];
        }
        returnArray[want.length] = x;
        returnArray[want.length + 1] = y;
        return returnArray;
    }

    static int[] insert(int[] want, int inputData) {
        int[] returnArray = new int[want.length + 1];
        for (int i = 0; i < want.length; i++) {
            returnArray[i] = want[i];
        }
        returnArray[want.length] = inputData;
        return returnArray;
    }

    public static void main(String[] args) {
        String[] wallpaper = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};

        int[] file = {};

        for (int i = 0; i < wallpaper.length; i++) {// y
            for (int j = 0; j < wallpaper[i].length(); j++) { // x
                if ("#".equals(String.valueOf(wallpaper[i].charAt(j)))) {
                    System.out.println("insert x = " + j + " y = " + i);
                    file = save(file, j, i);
                }
            }
        }

        System.out.println("file size == " + file.length);

        int[] xList = {};
        int[] yList = {};

        for (int i = 0; i < file.length; i++) {
            if (i % 2 == 0) { // x
                xList = insert(xList, file[i]);
            } else { // y
                yList = insert(yList, file[i]);
            }
        }

        int minX = Arrays.stream(yList).min().getAsInt();
        int minY = Arrays.stream(xList).min().getAsInt();
        int maxX = Arrays.stream(yList).max().getAsInt() + 1;
        int maxY = Arrays.stream(xList).max().getAsInt() + 1;
        int[] answer = {minX, minY, maxX, maxY};
    }
}
