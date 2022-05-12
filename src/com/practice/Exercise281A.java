package com.practice;

import java.util.Scanner;

public class Exercise281A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nonCapitalized = sc.nextLine();
        String[] splitList = nonCapitalized.split("");
        Character x = Character.toUpperCase(splitList[0].charAt(0));
        splitList[0] = x.toString();
        System.out.println(String.join("", splitList));

    }
}