package com.example.javaproject3.week1.day4;

import java.util.Scanner;

public class ScannerFloat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%.1f", (sc.nextFloat() + sc.nextFloat() + sc.nextFloat()) / 3);
    }
}
