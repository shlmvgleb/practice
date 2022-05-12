package com.practice.practice1205;

import java.util.Scanner;

public class Exercise200B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double count = sc.nextDouble();
        double counter = 0;
        for (int i = 0; i < (int) count; i++) {
            double x = sc.nextDouble();
            counter += x;
        }
        System.out.println(counter/count);
    }
}
