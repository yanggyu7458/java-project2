package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String days = scanner.next();
        String[] dayArr = days.split("\\.");
        int year = Integer.parseInt(dayArr[0]);
        int month = Integer.parseInt(dayArr[1]);
        int day = Integer.parseInt(dayArr[2]);

        System.out.printf("%02d-%02d-%04d", day, month, year);

    }
}
