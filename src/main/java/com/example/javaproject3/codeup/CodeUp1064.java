package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();
        System.out.println( (val1 > val2 ? val2 : val1) > val3 ? val3 : (val1 > val2 ? val2 : val1));
    }
}

