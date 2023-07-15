package com.mk.programers;

import java.util.Arrays;

public class BigNumAndSmallNum {
    public static void main(String[] args) {
        System.out.println(solution("-1 -1 -2"));
    }

    static String solution(String s) {

        String[] stringList = s.split(" ");

        int min = Integer.parseInt(stringList[0]);
        int max = Integer.parseInt(stringList[stringList.length - 1]);

        for (int i = 1; i < stringList.length + 1; i++) { // size = 4
            int temp = Integer.parseInt(stringList[i - 1]);
            if(min > temp){
                min = temp;
            }
            if(max < temp){
                max = temp;
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        String answer = min + " " + max;
        return answer;
    }
}
