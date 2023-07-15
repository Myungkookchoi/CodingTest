package com.mk.programers;

import java.util.Arrays;

public class Lotto {
    public static void main(String[] args){
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        System.out.println(Arrays.toString(soulution(lottos, win_nums)));

    }

    public static int[] soulution(int[] lottos, int[] win_nums) {
        int[] answer = {7,7};
        int countZero = 0;
        for(int i : lottos){
            for(int j : win_nums){
                if(i == j){
                    answer[0]--;
                    answer[1]--;
                }
            }
            if(i == 0){
                countZero++;
            }
        }
        answer[0] = answer[0] - countZero;
        for(int i = 0; i < answer.length; i++){
            if(answer[i] == 7){
                answer[i] = 6;
            }
        }
        return answer;
    }

}
