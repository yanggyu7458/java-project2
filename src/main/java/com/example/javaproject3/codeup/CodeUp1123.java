package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float celDeg = sc.nextFloat();
        float fahDeg = (float)9/5 * celDeg + 32;
        System.out.printf("%.3f\n", fahDeg);
    }
}
