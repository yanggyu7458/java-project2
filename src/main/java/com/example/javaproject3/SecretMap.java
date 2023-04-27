package com.example.javaproject3;

import java.util.Scanner;

public class SecretMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        String[] answer = new String[n];
        for(int i = 0 ; i < n ; i++) {
            arr1[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++) {
            arr2[i] = sc.nextInt();
        }

        for(int i = 0 ; i < n ; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for(int i = 0 ; i < n ; i++) {
            System.out.println(answer[i].replace("1", "#").replace("0", " "));
        }

    }
}
