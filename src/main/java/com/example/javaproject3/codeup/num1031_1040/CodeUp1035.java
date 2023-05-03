package com.example.javaproject3.codeup.num1031_1040;

import java.util.Scanner;

public class CodeUp1035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hexadecimal = scanner.nextLine();
        int StringToHexadecimal = Integer.parseInt(hexadecimal, 16); //문자로 받은 16진수를 integer 16진수로
        String HexadecimalToOct = Integer.toOctalString(StringToHexadecimal); // integer 16진수를 string 8진수로 변환
        System.out.println(HexadecimalToOct);
        //System.out.printf("%o", StringToHexadecimal); 이렇게 쓰면 integer 16진수를 string 8진수로 변환하는 과정 생략 가능
    }
}
