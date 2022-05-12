package com.practice.second;

import java.util.Scanner;

public class Exercise266A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int count = Integer.parseInt(x);
        String colors = sc.nextLine();
        int counter = 0;
        for (int i = 0; i < count - 1; i++) {
            if(colors.split("")[i].equals(colors.split("")[i + 1])) counter += 1;
        }
        System.out.println(counter);
    }
}
