package com.example.javaproject3.week2.day3;

import java.util.Arrays;

public class ArrayDefineAndAssign {
    public static void main(String[] args) {
        int[][] arr2 = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        for(int i=0; i<3; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }

    }
}
