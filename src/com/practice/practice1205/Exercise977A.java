package com.practice.practice1205;

import java.util.Scanner;

public class Exercise977A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int last = Integer.parseInt(String.valueOf(n).split("")[String.valueOf(n).split("").length - 1]);
            if (last > 0) n -= 1;
            else n /= 10;
        }
        System.out.println(n);
    }
}
