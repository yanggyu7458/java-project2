package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        System.out.printf("%d\n", (int)(a + b));
        System.out.printf("%d\n", (int)(a - b));
        System.out.printf("%d\n", (int)(a * b));
        System.out.printf("%d\n", (int)(a / b));
        System.out.printf("%d\n", (int)(a % b));
        System.out.printf("%.2f", a / b);

    }

}
