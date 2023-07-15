package com.mk.programers;

import java.util.Arrays;

public class Painting {

    public static void main(String[] args) {
        int[] a = {2, 3, 9};
        System.out.println(Solution.solution(10, 2, a));
    }
}

class Solution {
    public static int solution(int n, int m, int[] section) {
        int answer = 1;

        int start = section[0];
        int end = section[0] + m - 1;

        for (int i = 0; i < section.length; i++) {
            if (start <= section[i] && section[i] <= end) {
                continue;
            } else {
                start = section[i];
                end = section[i] + m - 1;
                answer++;
            }

        }
        return answer;
    }
}