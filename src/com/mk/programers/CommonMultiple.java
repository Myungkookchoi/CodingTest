package com.mk.programers;

public class CommonMultiple {
    public static void main(String[] args) {
        int number = 55;
        int n = 10;
        int m = 5;
        System.out.println(solution(number, n, m));
    }

    public static int solution(int number, int n, int m) {
        int answer = 0;
        if (number % n == 0 && number % m == 0) {
            answer = 1;
        }
        return answer;
    }
}
