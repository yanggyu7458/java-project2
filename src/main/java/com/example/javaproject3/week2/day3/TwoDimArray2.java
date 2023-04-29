package com.example.javaproject3.week2.day3;

import java.util.Arrays;

public class TwoDimArray2 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int[] arr0 = arr[0]; //2차원 배열에서 1행을 꺼내 다른 1차원 배열에 저장
        arr0[0] = 1;// 1차원 배열인 arr0에서 첫번째 칸에 1 할당

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
    }
}
