package com.practice.second;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise110A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long value = sc.nextLong();
        int counter = 0;
        ArrayList<Integer> array = new ArrayList<>();
        for (String s : String.valueOf(value).split("")) {
            array.add(Integer.parseInt(s));
        }
        for (Integer x : array) {
            if (x == 7 || x == 4) counter += 1;
        }
        ArrayList<Integer> array2 = new ArrayList<>();
        for (String s : String.valueOf(counter).split("")) {
            array2.add(Integer.parseInt(s));
        }
        if (array2.size() > 1) {
            for (int i = 0; i < array2.size() - 1; i++) {
                if (!((array2.get(i) == 4 || array2.get(i) == 7) &&
                        (array2.get(i + 1) == 4 || array2.get(i + 1) == 7))) {
                    System.out.println("NO");
                    break;
                }
            }
        }else{
            if (counter == 4 || counter == 7) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
