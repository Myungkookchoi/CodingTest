package com.mk.programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreasureMap {
    public static void main(String[] args) {
//        int n = 5;
//        int[] arr1 = {9, 20, 28, 18, 11};
//        int[] arr2 = {30, 1, 21, 17, 28};
        int n = 6;
        int[] arr1 = {46, 33, 33, 22, 31, 50};
        int[] arr2 = {27, 56, 19, 14, 14, 10};
        String[] result = {"#####", "# # #", "### #", "# ##", "#####"};
        System.out.println(solution(n, arr1, arr2).equals(result));
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < arr1.length; i++) {
            String inputString = "";
            String temp1 = Integer.toBinaryString(arr1[i]);
            String temp2 = Integer.toBinaryString(arr2[i]);
            if (temp1.length() < n) {
                for (int j = temp1.length(); j < n; j++) {
                    temp1 = "0" + temp1;
                }
            }
            if (temp2.length() < n) {
                for (int j = temp2.length(); j < n; j++) {
                    temp2 = "0" + temp2;
                }
            }
            for (int j = 0; j < n; j++) {
                if (temp1.charAt(j) == '1' || temp2.charAt(j) == '1') {
                    inputString += "#";
                } else {
                    inputString += " ";
                }
            }
            answer[i] = inputString;
        }

        return answer;
    }

}