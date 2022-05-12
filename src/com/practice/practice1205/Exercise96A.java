package com.practice.practice1205;

import java.util.Scanner;

public class Exercise96A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String situation = sc.nextLine();
        int counter = 1;
        for (int i = 0; i < situation.split("").length - 1; i++) {
            if (situation.split("")[i].equals(situation.split("")[i + 1])) counter += 1;
            if (counter >= 7) break;
            if (!situation.split("")[i].equals(situation.split("")[i + 1])) counter = 1;
        }
        if (counter >= 7) System.out.println("YES");
        else System.out.println("NO");
    }
}
