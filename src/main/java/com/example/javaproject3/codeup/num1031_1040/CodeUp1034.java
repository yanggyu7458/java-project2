package com.example.javaproject3.codeup.num1031_1040;

import java.util.Scanner;

public class CodeUp1034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String octal = scanner.nextLine();
        int stringToOctal = Integer.valueOf(octal, 8);
        System.out.println(stringToOctal);//출력은 10진수로
    }
}
