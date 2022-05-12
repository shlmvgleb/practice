package com.practice.first;

import java.util.Scanner;

public class Exercise50A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int m = Integer.parseInt(x.split(" ")[0]);
        int n = Integer.parseInt(x.split(" ")[1]);
        System.out.println((m * n) / 2);
    }
}
