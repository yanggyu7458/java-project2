package com.example.javaproject3.week3.day1;

public class MultiplicationTableUseMethod {
    public static void PrintDan(int dan) {
        for(int i = 1 ; i <= 9 ; i++)
            System.out.printf("%d * %d = %d\n", dan, i , dan * i);
        System.out.println("----------------");
    }
    public static void main(String[] args) {
        PrintDan(2);
        PrintDan(5);
        PrintDan(7);
    }
}
