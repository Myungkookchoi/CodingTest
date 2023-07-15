package com.mk.programers;

import java.util.Arrays;

public class ChangeUpper {
    public static void main(String[] args) {
        String input = "aBcDeFg";
        String[] a = input.split("");
        String temp = "";
        for(int i = 0; i < a.length; i++){
            if(!a[i].equals(a[i].toUpperCase())){
                temp += a[i].toUpperCase();
            } else {
                temp += a[i].toLowerCase();
            }
        }
        System.out.println("temp = " + temp);

        System.out.println("!@#$%^&*(\\'\"<>?:;");
    }
}
