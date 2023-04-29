package com.example.javaproject3.codeup.num1021_1030;

import java.util.Scanner;

public class CodeUp1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr = sc.next();
        String[] b_split = arr.split("\\.");
        System.out.println(b_split[0]);
        System.out.println(b_split[1]);
    }

}
