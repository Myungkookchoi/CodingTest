package com.mk.programers;

import java.util.HashMap;
import java.util.Map;

public class Park {
    public static void main(String[] args) {
//["SOO","OXX","OOO"]	["E 2","S 2","W 1"]	[0,1]
//["OSO","OOO","OXO","OOO"]	["E 2","S 3","W 1"]	[0,0]
        String[] park = {"SOO","OXX","OOO"};
        String[] routes = {"E 2","S 2","W 1"};
        int xSize = park[0].length();
        int ySize = park.length;
//        [2,1]
        int[] startPoint = new int[2];
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].contains("S")) {
                    startPoint[0] = i;
                }
            }
        }
        startPoint[1] = park[startPoint[0]].indexOf("S");


        System.out.println("[" + startPoint[0] + " , " + startPoint[1] + "]");

        for (String route : routes) {
            System.out.println(route);
            int temp = 0;
            if (route.split(" ")[0].equals("E")) {
                temp = startPoint[1];
                for (int i = 0; i < Integer.parseInt(route.split(" ")[1]); i++) {
                    startPoint[1] = startPoint[1] + 1;
                    if (startPoint[1] >= xSize) {
                        startPoint[1] = temp;
                        break;
                    }
                    try {
                        char charToPark = park[startPoint[0]].charAt(startPoint[1]);//character t
                        String check = String.valueOf(charToPark);//char to string
                        if (check.equals("X")) {
                            startPoint[1] = temp;
                            break;
                        }
                    } catch (Exception e) {
                        startPoint[1] = temp;
                        break;
                    }
                }
                System.out.println("[" + startPoint[0] + " , " + startPoint[1] + "]");
            } else if (route.split(" ")[0].equals("W")) {
                temp = startPoint[1];
                for (int i = 0; i < Integer.parseInt(route.split(" ")[1]); i++) {
                    startPoint[1] = startPoint[1] - 1;
                    if (startPoint[1] < 0) {
                        startPoint[1] = temp;
                        break;
                    }
                    try {
                        char charToPark = park[startPoint[0]].charAt(startPoint[1]);//character t
                        String check = String.valueOf(charToPark);//char to string
                        if (check.equals("X")) {
                            startPoint[1] = temp;
                            break;
                        }
                    } catch (Exception e) {
                        startPoint[1] = temp;
                        break;
                    }
                }
                System.out.println("[" + startPoint[0] + " , " + startPoint[1] + "]");
            } else if (route.split(" ")[0].equals("S")) {
                temp = startPoint[0];
                for (int i = 0; i < Integer.parseInt(route.split(" ")[1]); i++) {
                    startPoint[0] = startPoint[0] + 1;
                    if (startPoint[0] >= ySize) {
                        startPoint[0] = temp;
                        break;
                    }
                    try {
                        char charToPark = park[startPoint[0]].charAt(startPoint[1]);//character t
                        String check = String.valueOf(charToPark);//char to string
                        if (check.equals("X")) {
                            startPoint[0] = temp;
                            break;
                        }
                    } catch (Exception e) {
                        startPoint[0] = temp;
                        break;
                    }
                }
                System.out.println("[" + startPoint[0] + " , " + startPoint[1] + "]");
            } else if (route.split(" ")[0].equals("N")) {
                temp = startPoint[0];
                for (int i = 0; i < Integer.parseInt(route.split(" ")[1]); i++) {
                    startPoint[0] = startPoint[0] - 1;
                    if (startPoint[0] < 0) {

                        startPoint[0] = temp;
                        break;
                    } else {
                        try {
                            char charToPark = park[startPoint[0]].charAt(startPoint[1]);//character t
                            String check = String.valueOf(charToPark);//char to string
                            if (check.equals("X")) {
                                startPoint[0] = temp;
                                break;
                            }
                        } catch (Exception e) {
                            startPoint[0] = temp;
                            break;
                        }
                    }
                }
                System.out.println("[" + startPoint[0] + " , " + startPoint[1] + "]");
            }
        }

        System.out.println("[" + startPoint[0] + " , " + startPoint[1] + "]");
        System.out.println("종료");
    }
}
