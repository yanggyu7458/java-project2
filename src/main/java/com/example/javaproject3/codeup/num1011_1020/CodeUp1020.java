package com.example.javaproject3.codeup.num1011_1020;

import java.util.Scanner;

public class CodeUp1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        String[] arr = num.split("\\-");
        System.out.printf("%s%s", arr[0], arr[1]);
    }
}
