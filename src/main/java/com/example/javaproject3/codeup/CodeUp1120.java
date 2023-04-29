package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        int iVal3 = sc.nextInt();
        float sum = (iVal1+iVal2+iVal3);
        System.out.printf("%.2f\n", sum/3);
    }
}
