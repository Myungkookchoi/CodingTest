package com.mk.programers;

import java.util.*;

public class Dart {
    public static void main(String[] args) {
        String input = "1D2S3T*";
        System.out.println(solution(input));
    }

    public static int solution(String dartResult) {
        int answer = 0;
        String[] inputs = dartResult.split("");
        String[] strings = new String[3];
        int[] point = new int[3];

        Map<String, Integer> zegup = new HashMap<String, Integer>() {
            {
                put("S", 1);

                put("D", 2);

                put("T", 3);
            }
        };

        int pointIndex = 0;

        for (int i = 0; i < inputs.length; i++) {
            try {
                if (inputs[i].equals("1") && inputs[i + 1].equals("0")) {
                    point[pointIndex] = 10;
                    pointIndex++;
                    i++;
                } else {
                    point[pointIndex] = Integer.valueOf(inputs[i]);
                    pointIndex++;
                }
            } catch (Exception e) {
                if (zegup.containsKey(inputs[i])) {
                    int temp = point[pointIndex - 1];
                    for (int j = 1; j < zegup.get(inputs[i]); j++) {
                        temp = temp * point[pointIndex - 1];
                    }
                    point[pointIndex - 1] = temp;
                }
                if (inputs[i].equals("*")) {
                    for (int j = 1; j < pointIndex + 1; j++) {
                        point[j - 1] = point[j - 1] * 2;
                    }
                    if (pointIndex == 3) {
                        point[0] = point[0] / 2;
                    }
                }
                if (inputs[i].equals("#")) {
                    point[pointIndex - 1] = point[pointIndex - 1] * -1;
                }
            }
        }
        System.out.println(Arrays.toString(point));
        System.out.println(Arrays.toString(strings));

        // * 받은 점수 2배(중첩 가능)
        // # 해당 점수 마이너스(중첩 가능)

        for (int i = 0; i < point.length; i++) {
            answer = answer + point[i];
        }

        return answer;
    }
}
