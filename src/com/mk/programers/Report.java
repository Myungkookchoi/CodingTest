package com.mk.programers;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Report {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        //                      2, 1, 1, 0
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        report = Arrays.stream(report).distinct().collect(Collectors.toList()).toArray(new String[report.length]);


        String from = "";
        String to = "";
        for(int i = 0; i < report.length; i++){
            from = from + "," + report[i].split(" ")[0];
            to = to  + "," + report[i].split(" ")[1];
        }
        from = from.substring(1, from.length());
        to = to.substring(1, to.length());

        String[] fromReport = from.split(",");
        String[] toReport = to.split(",");


        Map<String, Integer> toReportCount = new HashMap<>();
        for(int i = 0; i < id_list.length; i++){
            int cnt = 0;
            for(int j = 0; j < toReport.length; j++){
                if(toReport[j].equals(id_list[i])){
                    cnt++;
                }
            }
            toReportCount.put(id_list[i], cnt);
        }

        Map<String, Integer> fromReportCount = new HashMap<>();
        for(int i = 0; i < id_list.length; i++){
            int cnt = 0;
            for(int j = 0; j < toReport.length; j++){
                if(fromReport[j].equals(id_list[i])){
                    cnt++;
                }
            }
//            if(cnt < k){
//                cnt = 0;
//            }
            fromReportCount.put(id_list[i], cnt);
        }
        System.out.println(toReportCount);
        System.out.println(fromReportCount);
    }

}
