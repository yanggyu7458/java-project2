package com.example.javaproject3.week2.day4;

public class Accumulate687 {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;
        answer = answer + num % 10;
        System.out.printf("answer : %d\n", answer);
        num = num / 10;
        answer = answer + num % 10;
        System.out.printf("answer : %d\n", answer);
        num = num / 10;
        answer = answer + num % 10;
        System.out.printf("answer : %d\n", answer);
    }
}
