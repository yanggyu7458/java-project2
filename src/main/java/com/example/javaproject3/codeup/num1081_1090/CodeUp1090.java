package com.example.javaproject3.codeup.num1081_1090;

import java.util.Scanner;

public class CodeUp1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startVal = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        long answer = startVal;

        for(int i = 2 ; i <= n ; i++) {
            answer = answer * r;
        }
        System.out.println(answer);
    }
}
