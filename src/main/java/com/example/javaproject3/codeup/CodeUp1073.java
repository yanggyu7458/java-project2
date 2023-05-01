package com.example.javaproject3.codeup;

import java.util.Scanner;

public class CodeUp1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*for(int i = sc.nextInt() ; i != 0; ) {
            System.out.println(i);
        }*/
        while(true) {
            int iVal = sc.nextInt();
            if(iVal == 0)
                break;
            System.out.println(iVal);
        }
    }
}
