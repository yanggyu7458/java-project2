package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] call = new int[num];
        int small = 10000;
        for(int i = 0 ; i < num ; i++) {
            call[i] = sc.nextInt();
        }
        for(int i = 0 ; i < num ; i++) {
            if(call[i] < small) {
                small = call[i];
            }
        }
        System.out.println(small);
    }
}
