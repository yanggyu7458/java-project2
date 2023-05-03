package com.example.javaproject3.codeup.num1081_1090;

import java.util.Scanner;

public class CodeUp1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float w = sc.nextFloat();
        float h = sc.nextFloat();
        float b = sc.nextFloat();


        float result = (w*h*b) / 8 / 1024/ 1024;
        System.out.printf("%.2f MB\n", result);
    }
}
