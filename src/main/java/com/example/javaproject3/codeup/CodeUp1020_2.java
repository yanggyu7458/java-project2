package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1020_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        String[] numbers = new String[2];
        numbers[0] = number.substring(0, 6);
        numbers[1] = number.substring(7, 14);
        System.out.println(numbers[0] + numbers[1]);

    }
}
