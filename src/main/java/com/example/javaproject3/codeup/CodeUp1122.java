package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputSec = sc.nextInt();
        int min = inputSec / 60;
        int sec = inputSec % 60;
        System.out.printf("%d %d\n", min, sec);
    }
}
