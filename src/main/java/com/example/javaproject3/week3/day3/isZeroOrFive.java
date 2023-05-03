package com.example.javaproject3.week3.day3;

public class isZeroOrFive {
    public static boolean isZeroOrFive(int num) {
        while(num > 0) {
            int remainder = num % 10;
            if(remainder % 5 != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
    public static void main(String[] args) {

        int num = 555;

        if(isZeroOrFive(num) == true){
            System.out.println("0 또는 5로만 이루어진 숫자입니다.");
        } else System.out.println("0 또는 5로만 이루어진 숫자가 아닙니다.");

    }
}
