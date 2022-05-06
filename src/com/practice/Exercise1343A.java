package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1343A {
    public static void main(String[] args) {
        StringBuilder finalString = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0; i < count; i++){
            array.add(sc.nextInt());
        }
        for (Integer n : array) {
            boolean status = true;
            int k = 2;
            int result;
            while(status){
                if (n % toPow(k) == 0){
                    result = n / toPow(k);
                    finalString.append(result).append("\n");
                    status = false;
                }else{
                    k += 1;
                }
            }
        }
        System.out.println(finalString);
    }
    public static int toPow(int allDays) {
        int result = 0;
        for (int i = 1; i < allDays + 1; i++){
            result += (int)Math.pow(2, i - 1);
        }
        return result;
    }
}