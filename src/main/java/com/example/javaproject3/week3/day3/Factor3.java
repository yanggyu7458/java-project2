package com.example.javaproject3.week3.day3;

public class Factor3 {
    public static void main(String[] args) {
        int n = 36;
        int answer = 0;
        for(int i = 1 ; i <= 36 ; i++) {
            if(n % i == 0) {
                System.out.println(i);
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
