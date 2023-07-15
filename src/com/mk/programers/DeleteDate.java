package com.mk.programers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DeleteDate {
    static Integer[] solution(String today, String[] terms, String[] privacies) {
        today = today.replace(".", "-");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate todayDate = LocalDate.parse(today, formatter);

        Map<String, Integer> termsToMap = new HashMap<>();
        for (String term : terms) {
            String type = term.split(" ")[0];
            int month = Integer.parseInt(term.split(" ")[1]);
            termsToMap.put(type, month);
        }

        List<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            LocalDate privacy = LocalDate.parse(privacies[i].split(" ")[0].replace(".", "-"), formatter).plusMonths(termsToMap.get(privacies[i].split(" ")[1]));
            LocalDate changeToday = LocalDate.parse(today.replace(".", "-"), formatter);
            if (privacy.isBefore(changeToday) || privacy.isEqual(changeToday)) {
                answerList.add(i + 1);
            }
        }

        Integer[] answer = answerList.stream().toArray(Integer[]::new);

        return answer;
    }

    public static void main(String[] args) {
        String a = "2020.01.01";
        String[] b = {"Z 3", "D 5"};
        String[] c = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        System.out.println(Arrays.toString(solution(a, b, c)));
    }

}