package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        //String[] strArr = new String[str.length()];
        for(int i = 0 ; i < str.length() ; i++) {
            System.out.printf("'%c'\n", str.charAt(i));
        }
    }
}
