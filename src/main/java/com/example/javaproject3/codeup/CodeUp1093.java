package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1093 {
    public static void main(String[] args) {
        int[] students = new int[23];
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int tmp;

        for(int i = 1 ; i <= num ; i++) {
            tmp = sc.nextInt();
            students[tmp-1]++;
        }
        for(int i = 0 ; i < students.length ; i++) {
            System.out.printf("%d ", students[i]);
        }

    }
}
