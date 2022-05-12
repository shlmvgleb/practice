package com.practice.pratice1205;

import java.util.Scanner;

public class Exercise59A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String[] symbols = word.split("");
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < symbols.length; i++) {
            if (Character.isUpperCase(word.charAt(i))) counter1 += 1;
            if (Character.isLowerCase(word.charAt(i))) counter2 += 1;
        }
        if (counter1 > counter2) word = word.toUpperCase();
        else word = word.toLowerCase();
        System.out.println(word);
    }
}
