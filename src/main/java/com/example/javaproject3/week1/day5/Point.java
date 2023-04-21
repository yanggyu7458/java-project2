package com.example.javaproject3.week1.day5;

public class Point {
    int x;
    int y;

    boolean isSameXY() {
        return x == y;
    }
    double getDistance(Point p2) {
        double xL = Math.pow(p2.x, 2);
        double yL = Math.pow(p2.y, 2);

        return Math.sqrt(xL + yL);
    }
}
