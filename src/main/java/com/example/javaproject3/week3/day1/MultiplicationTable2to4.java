package com.example.javaproject3.week3.day1;

public class MultiplicationTable2to4 {
    public static void main(String[] args) {
        for(int i = 2 ; i <= 4 ; i++) {
            for(int j = 1 ; j <=9 ; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i*j);
            }
            System.out.println("------------------");
        }
    }
}
