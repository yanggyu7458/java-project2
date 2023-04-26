package com.example.javaproject3.week2.day3;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArrFillRowEx {
    public static void main(String[] args) {
        TwoDimArrFillRowMethod fillRow = new TwoDimArrFillRowMethod();
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[5][5];
        int rowNum = scanner.nextInt();
        fillRow.FillArrayRow(arr, rowNum);
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
