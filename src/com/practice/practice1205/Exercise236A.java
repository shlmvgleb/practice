package com.practice.practice1205;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Exercise236A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        HashSet<String> symbols = new HashSet<>();
        Collections.addAll(symbols, username.split(""));
        if (symbols.size() % 2 == 0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
    }
}
