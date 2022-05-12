package com.practice.first;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise231A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        ArrayList<String> array = new ArrayList<>();
        for(int i = 0; i < count + 1; i++){
            array.add(sc.nextLine());
        }
        int answersCounter = 0;
        int exercisesCounter = 0;
        for (String s : array) {
            for (String digit : s.split(" ")) {
                if (digit.equals("1")) answersCounter += 1;
            }
            if (answersCounter >= 2) exercisesCounter += 1;
            answersCounter = 0;
        }
        System.out.println(exercisesCounter);
    }
}
