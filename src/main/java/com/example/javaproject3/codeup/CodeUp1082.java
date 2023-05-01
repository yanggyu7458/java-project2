package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String iVal = sc.nextLine();
        int hexVal = Integer.parseInt(iVal, 16);
        for(int i = 1 ; i <= 15 ; i++) {
            System.out.printf("%X * %X = %X\n", hexVal, i, hexVal * i);
        }

    }
}
