package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startVal = sc.nextInt();
        int multi = sc.nextInt();
        int add = sc.nextInt();
        int num = sc.nextInt();
        long answer = startVal;

        for(int i = 2 ; i <= num ; i++) {
            answer = answer * multi + add;
        }
        System.out.println(answer);
    }
}
