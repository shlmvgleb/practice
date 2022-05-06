package com.practice;

import java.util.Scanner;

public class Exercise1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String [] array = x.split(" ");
        long m = Integer.parseInt(array[0]);
        long n = Integer.parseInt(array[1]);
        long a = Integer.parseInt(array[2]);
        long count1 = 0;
        long count2 = 0;
        if (m % a == 0){
            count1 = (m / a);
        }else {
            count1 = (m / a) + 1;
        }
        if (n % a == 0){
            count2 = (n / a);
        }else {
            count2 = (n / a) + 1;
        }
        System.out.println(count1 * count2);
    }
}
