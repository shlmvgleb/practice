package com.practice.first;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise158A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String values = sc.nextLine();
        int n = Integer.parseInt(values.split(" ")[0]);
        int k = Integer.parseInt(values.split(" ")[1]);
        String points = sc.nextLine();
        ArrayList<Integer> array = new ArrayList<>();
        for (String s : points.split(" ")) {
            array.add(Integer.parseInt(s));
        }
        int counter = 0;
        for (int x : array) {
            if (x >= array.get(k - 1) & x > 0) counter += 1;
        }
        System.out.println(counter);
    }
}
