package com.practice.practice0505;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise263A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> array = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            String x = sc.nextLine();
            array.add(new ArrayList<>());
            for (String s : x.split(" ")) {
                array.get(i).add(Integer.parseInt(s));
            }
        }
        int x = 0;
        int y = 0;
        int perfectPositionX = 2;
        int perfectPositionY = 2;
        for (int i = 0; i < array.size();i++) {
            for (int j = 0; j < array.get(i).size(); j++) {
                if (array.get(i).get(j) == 1){
                    y = i;
                    x = j;
                }
            }
        }
        System.out.println(Math.abs(perfectPositionX - x) + Math.abs(perfectPositionY - y));
    }
}
