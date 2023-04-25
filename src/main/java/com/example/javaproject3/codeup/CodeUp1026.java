package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time = scanner.next();
        String[] timeArr = time.split("\\:");
        System.out.printf("%d", Integer.parseInt(timeArr[1]));
    }
}
