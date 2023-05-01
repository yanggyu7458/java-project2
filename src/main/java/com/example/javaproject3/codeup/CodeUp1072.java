package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int[] inputArr = new int[inputNum];
        for (int i = 0; i < inputNum; i++) {
            inputArr[i] = sc.nextInt();
        }
        for (int i = 0; i < inputArr.length; i++) {
            System.out.println(inputArr[i]);
        }
    }
}
