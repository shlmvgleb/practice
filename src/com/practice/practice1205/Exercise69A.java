package com.practice.practice1205;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise69A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> array = new ArrayList<>();
        String line = sc.nextLine();
        int count = Integer.parseInt(line);
        for(int i = 0; i < count; i++){
            String x = sc.nextLine();
            array.add(new ArrayList<>());
            for (String s : x.split(" ")) {
                array.get(i).add(Integer.parseInt(s));
            }
        }
        ArrayList<ArrayList<Integer>> flipped = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> x = new ArrayList<>();
            for (ArrayList<Integer> integers : array) {
                x.add(integers.get(i));
            }
            flipped.add(x);
        }
        int counter = 0;
        int result = 0;
        for (ArrayList<Integer> element : flipped) {
            for (Integer number : element) {
                counter += number;
            }
            if (counter == 0) result += 1;
        }
        if (result == flipped.size()) System.out.println("YES");
        else System.out.println("NO");
    }

}
