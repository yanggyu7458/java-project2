package com.example.javaproject3.week2.day3;

public class Remainder687Sum {
    public static void main(String[] args) {
        int num = 678;
        int firstRemainder = num % 10;
        num /= 10; // == num = num / 10;
        int secondRemainder = num % 10;
        num /= 10;
        int thirdRemainder = num % 10;
        System.out.printf("%d", firstRemainder + secondRemainder + thirdRemainder);
    }
}
