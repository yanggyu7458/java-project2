package com.example.javaproject3.week3.day3;

public class Factor {
    public static void main(String[] args) {
        int n = 36;
        for(int i = 1 ; i <= 36 ; i++) {
            if(n % i == 0)
                System.out.println(n + " % " + i + " = " + "0");
        }
    }
}
