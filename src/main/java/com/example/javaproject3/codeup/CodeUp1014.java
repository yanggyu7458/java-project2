package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char firstChar = sc.next().charAt(0);
        char secondChar = sc.next().charAt(0);

        System.out.printf("%c %c", secondChar, firstChar);
    }

}
