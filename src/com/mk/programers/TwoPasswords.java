package com.mk.programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoPasswords {
    public static void main(String[] args) {
        String s = "klmnopqrstuvwxyz";
        String skip = "abcdefghij";
        int index = 20;
        System.out.println(solution(s, skip, index));
        System.out.println("opqrstuvwxyzklmn");
    }

    public static String solution(String s, String skip, int index) {
        String answer = "";
        char[] temp = s.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            for (int j = 1; j < index + 1; j++) {
                temp[i]++;
                if (temp[i] == '{') {
                    temp[i] = 'a';
                }
                while (true) {
                    if (skip.contains(Character.toString(temp[i]))) {
                        temp[i]++;
                        if (temp[i] == '{') {
                            temp[i] = 'a';
                        }
                    } else {
                        break;
                    }
                }
            }
            answer = answer + temp[i];
        }
        return answer;
    }
}
// a b c d e f g h i j k l n m o p q r s t u v w x y z