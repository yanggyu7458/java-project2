package com.example.javaproject3.codeup.num1081_1090;

import java.util.Scanner;

public class CodeUp1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startVal = sc.nextInt();
        int d = sc.nextInt();
        int num = sc.nextInt();
        int answer = startVal;

        for(int i = 2 ; i <= num ; i++) {
            answer += d;
        }
        System.out.println(answer);
    }
}
