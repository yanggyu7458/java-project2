package com.example.javaproject3.week2.day5;

import java.util.Scanner;

public class BCompanyHRSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int projectNum = sc.nextInt();

        if(year > 5 || projectNum >10) {
            System.out.println("팀장 승진 대상입니다.");
        } else
            System.out.println("팀장 승진 대상이 아닙니다");
    }
}
