package com.example.javaproject3.codeup.num1081_1090;

import java.io.*;
import java.util.Scanner;

public class CodeUp1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] color = br.readLine().split(" ");
        Scanner sc = new Scanner(System.in);

        int count = 0;
        for (int i = 0; i < Integer.parseInt(color[0]) ; i++) {
            for (int j = 0; j < Integer.parseInt(color[1]) ; j++) {
                for (int k = 0; k < Integer.parseInt(color[2]) ; k++) {
                    bw.write(i+" "+j+" "+k+"\n");
                    count++;
                }

            }
            
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}
