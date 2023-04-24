package com.example.javaproject3.week2;

public class FloatPlus {
    public static void main(String[] args) {
        String val1 = "1.11111111";
        String val2 = "2.11111111";
        float fResult = Float.parseFloat(val1) + Float.parseFloat(val2);
        double dResult = Double.parseDouble(val1) + Double.parseDouble(val2);
        System.out.println(fResult);
        System.out.println(dResult);
    }
}
