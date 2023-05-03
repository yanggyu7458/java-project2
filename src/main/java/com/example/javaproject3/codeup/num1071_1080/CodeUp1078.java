package com.example.javaproject3.codeup.num1071_1080;

import java.util.Scanner;

public class CodeUp1078 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        for(int i = 0 ; i <= iVal ; i+=2)
            sum += i;
        System.out.println(sum);
    }
}
