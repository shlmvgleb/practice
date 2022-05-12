package com.practice.practice1205;

import java.util.Scanner;

public class Exercise791A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String weights = sc.nextLine();
        int limak = Integer.parseInt(weights.split(" ")[0]);
        int bob = Integer.parseInt(weights.split(" ")[1]);
        int counter = 0;
        while (limak <= bob){
            limak *= 3;
            bob *= 2;
            counter += 1;
        }
        System.out.println(counter);
    }
}
