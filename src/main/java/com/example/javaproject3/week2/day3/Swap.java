package com.example.javaproject3.week2.day3;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 8, 7, 6};
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
