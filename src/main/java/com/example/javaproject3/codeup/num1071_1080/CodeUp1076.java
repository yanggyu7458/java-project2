package com.example.javaproject3.codeup.num1071_1080;

import java.util.Scanner;

public class CodeUp1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        for(int i = 97; i <= c ; i++)
            System.out.printf("%c ", i);
    }
}
