package com.example.javaproject3;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < 4 ; i++) {
            for(int j = 0 ; j < 5 - i ; i++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i = 0 ; i < 5 ; i++) {
            System.out.println(arr[i]);
        }


    }
}
