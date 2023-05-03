package com.example.javaproject3.week3.day2;

import java.util.Scanner;

public class WhileSum {
    public class WhileS {
        public int solution(int n) {
            int answer = 0;
            while(n > 0) {

                answer += (n%10);
                n = n / 10;

            }
            // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
            System.out.println(answer);

            return answer;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    }
}
