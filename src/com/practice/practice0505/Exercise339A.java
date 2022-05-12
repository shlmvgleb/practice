package com.practice.practice0505;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise339A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        ArrayList<Integer> array = new ArrayList<>();
        for(String s: value.split("\\+")){
            array.add(Integer.parseInt(s));
        }
        for(int i = 0; i < array.size(); i++){
            for(int j = 0; j < array.size() - 1; j++){
                if (array.get(j) > array.get(j + 1)){
                    int x = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, x);
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (Integer integer : array) {
            result.append(integer);
            result.append("+");
        }
        result.deleteCharAt(result.length() - 1);
        System.out.println(result);
    }
}
