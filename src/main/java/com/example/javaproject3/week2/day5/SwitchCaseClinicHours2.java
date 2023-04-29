package com.example.javaproject3.week2.day5;

import java.util.Scanner;

public class SwitchCaseClinicHours2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.next();
        String time;
        switch(day) {
            case "월", "화", "수","목", "금" : time = "09:30 ~ 18:30"; break;
            case "토" : time = "09:30 ~ 13:00"; break;
            case "공휴일", "일" : time = "휴진"; break;
            case "점심시간" : time = "13:00 ~ 14:00"; break;
        }
    }
}
