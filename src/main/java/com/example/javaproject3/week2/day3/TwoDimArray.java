package com.example.javaproject3.week2.day3;

import java.util.Arrays;

public class TwoDimArray {
    public static void printArray(int[][] arr) {
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println("-----------------------");
    }
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        printArray(arr);

        int[] arr0 = arr[0];
        int[] arr1 = arr[1];
        int[] arr2 = arr[2];
        arr0[0] = 1;
        arr0[2] = 2;
        arr1[0] = 3;
        printArray(arr);

        arr1[1] = 5;
        printArray(arr);

    }
}
