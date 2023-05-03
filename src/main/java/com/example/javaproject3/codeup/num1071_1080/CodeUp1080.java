package com.example.javaproject3.codeup.num1071_1080;

import java.util.Scanner;

public class CodeUp1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumVal = sc.nextInt();
        int sum = 0;

        for(int i = 1 ; i < sumVal ; i++) {
            sum += i;
            if(sum >= sumVal) {
                System.out.println(i);
                break;
            }
        }
    }
}
