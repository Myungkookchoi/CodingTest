package com.mk.programers;

import java.io.*;
import java.util.*;

public class Memory {

    static int[] Add(int[] originArray, int val) {
        int[] newArray = new int[originArray.length + 1];

        // 순서 2. 새로운 배열에 값을 순차적으로 할당
        for (int index = 0; index < originArray.length; index++) {
            newArray[index] = originArray[index];
        }

        // 순서 3. 새로운 배열의 마지막 위치에 추가하려는 값을 할당
        newArray[originArray.length] = val;

        // 순서 4. 새로운 배열을 반환
        return newArray;
    }

    public static void main(String[] args) throws IOException {
        String[] names = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}
                , {"may", "kein", "brin", "deny"}
                , {"kon", "kain", "may", "coni"}};
        int[] answer = {};

        Map<String, Integer> mapping = new HashMap<>();
        if (names.length == yearning.length) {
            for (int i = 0; i < names.length; i++) {
                mapping.put(names[i], yearning[i]);
            }
        }

        for (int i = 0; i < photo.length; i++) {
            int result = 0;
            System.out.println("i == >>> :: " + i);
            for (int j = 0; j < photo[i].length; j++) {
                if (mapping.containsKey(photo[i][j])) {
                    result = result + mapping.get(photo[i][j]);
                }
            }
            System.out.println("result == >>> :: " + result);
            answer = Add(answer, result);
        }

        System.out.println(answer);
    }
}
