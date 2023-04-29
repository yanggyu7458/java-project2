package com.example.javaproject3;

import java.util.Scanner;

class Solution5 {
    public int solution(int num) {
        int answer = 0;
        long Val = num;
        while(Val > 1) {
            if (Val % 2 == 0) {
                Val = Val / 2;
                answer++;
            } else if (Val % 2 == 1) {
                Val = Val * 3 + 1;
                answer++;
            }
            if(Val == 1) {
                System.out.println(answer);
                break;
            } else if (answer > 500) {
                return -1;
            }
        }
        return answer;
    }
}
public class Collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Solution5 sol = new Solution5();
        sol.solution(num);

    }
}
