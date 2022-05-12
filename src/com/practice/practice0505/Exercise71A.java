package com.practice.practice0505;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise71A {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        Scanner sc1 = new Scanner(System.in);
        int count = sc1.nextInt();
        ArrayList<String> array = new ArrayList<>();
        for(int i = 0; i < count + 1; i++){
            array.add(sc1.nextLine());
        }
        int counter;
        for(String word:array){
            if(word.length() > 10){
                counter = word.length() - 2;
                result.append(word.charAt(0)).append(counter).
                        append(word.charAt(word.length()-1)).append('\n');
            }else{
                result.append(word).append('\n');
            }
        }
        System.out.println(result);
    }
}
