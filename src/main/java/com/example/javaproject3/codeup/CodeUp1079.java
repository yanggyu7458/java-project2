package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            char cVal = sc.next().charAt(0);
            System.out.println(cVal);
            if(cVal == 'q'){
                break;
            }
        }
    }
}
