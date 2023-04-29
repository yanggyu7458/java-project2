package com.example.javaproject3.week2.day4;

import java.util.Arrays;

public class ComparisonArray {
    public static void swap(int[] arr, int bVal, int sVal) {
        int temp = 0;
        temp = bVal;
        bVal = sVal;
        sVal = temp;

    }
    public static void main(String[] args) {

        int[] arr = {2, 1, 7, 9};
        for(int i = 0 ; i < arr.length - 1 ; i++) {
            if(arr[i] > arr[i+1]) {
                swap(arr, arr[i], arr[i+1]);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
