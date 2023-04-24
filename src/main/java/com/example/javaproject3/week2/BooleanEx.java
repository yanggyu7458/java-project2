package com.example.javaproject3.week2;

public class BooleanEx {
    public static void main(String[] args) {
        boolean flag1 = false;
        boolean flag2 = true;

        boolean isPaymentSuccess = false;
        boolean isBalanceSufficient = true;
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(isPaymentSuccess == isBalanceSufficient);
    }
}
