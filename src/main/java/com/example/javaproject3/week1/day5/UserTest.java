package com.example.javaproject3.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User kyeongrok = new User();
        kyeongrok.username = "김경록";
        kyeongrok.phoneNumber = "12345678";
        kyeongrok.age = 37;

        User jaewon = new User();
        jaewon.username = "양재원";
        jaewon.phoneNumber = "00000000";
        jaewon.age = 29;

        System.out.printf("%s는(은) 성인입니까? : %b", kyeongrok.username, kyeongrok.isAdult());

    }
}
