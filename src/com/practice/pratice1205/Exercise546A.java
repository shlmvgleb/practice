package com.practice.pratice1205;

import java.util.Scanner;

public class Exercise546A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        System.out.println(Math.max((toSum(k, w) - n), 0));
    }
    public static int toSum (int firstBanana, int bananas){
        int counter = 0;
        for (int i = 1; i < bananas + 1; i++) {
            counter += firstBanana * i;
        }
        return counter;
    }
}

