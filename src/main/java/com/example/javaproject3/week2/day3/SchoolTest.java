package com.example.javaproject3.week2.day3;

public class SchoolTest {
    public static void main(String[] args) {
        School classInSchool = new School();
        classInSchool.no = 1;
        classInSchool.teacher = new Teacher();
        classInSchool.teacher.name = "홍길동";
        classInSchool.teacher.age = 33;
        classInSchool.teacher.address = "강남";
        classInSchool.student = new Student[30];
    }
}
