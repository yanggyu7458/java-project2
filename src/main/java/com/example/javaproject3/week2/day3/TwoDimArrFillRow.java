package com.example.javaproject3.week2.day3;

import java.util.Arrays;

public class TwoDimArrFillRow {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            arr[2][i] = 1;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
