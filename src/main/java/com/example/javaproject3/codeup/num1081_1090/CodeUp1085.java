package com.example.javaproject3.codeup.num1081_1090;

import java.util.Scanner;

public class CodeUp1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float h = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float s = sc.nextFloat();

        float result = (h*b*c*s) / 8 / 1024/ 1024;
        System.out.printf("%.1f MB\n", result);

    }
}
