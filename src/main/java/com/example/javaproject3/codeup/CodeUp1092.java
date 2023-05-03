package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user1 = sc.nextInt();
        int user2 = sc.nextInt();
        int user3 = sc.nextInt();
        int day = 1;

        while(day % user1 != 0 || day % user2 != 0 || day % user3 != 0) {
            day++;
        }
        System.out.println(day);
    }
}
