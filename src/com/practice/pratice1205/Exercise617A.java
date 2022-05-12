package com.practice.pratice1205;

import java.util.*;

public class Exercise617A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] x1 = {1, 2, 3, 4, 5};
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i : x1) {
            numbers.add(i);
        }
        int m = 0;
        int min = numbers.get(numbers.size() - 1);
        for (Integer number : numbers) {
            if (x / number <= x) {
                min = x / number;
                m = number;
            }
        }
        if(x % m > 0) System.out.println(min + 1);
        else System.out.println(min);
    }
}
