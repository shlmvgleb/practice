package com.practice.first;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise282A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        ArrayList<String> array = new ArrayList<>();
        for(int i = 0; i < count + 1; i++){
            array.add(sc.nextLine());
        }
        int x = 0;
        for (String s : array) {
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '-'){
                    x -= 1;
                    break;
                }else if (s.charAt(i) == '+'){
                    x += 1;
                    break;
                }
            }
        }
        System.out.println(x);
    }
}
