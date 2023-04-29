package com.example.javaproject3.week2.day4;

public class ArraySum {
    public static void main(String[] args) {
        int answer = 0;
        int[] arr = {2, 1, 7, 9};
        answer += arr[0];
        answer += arr[1];
        answer += arr[2];
        answer += arr[3];
        // for(int i = 0 ; i < arr.length ; i++) {
        //     answer += arr[i];
        //    }

        System.out.printf("answer : %d", answer);
    }
}
