package com.example.javaproject3.week1.day5;

public class SpaceInvader {
        private void moveLeft() {
        int location = 0;
        location = -1;
        }
        private void moveRight() {
            int location = 0;
            location = 1;
        }



    public static void main(String[] args) {
        SpaceInvader spaceInvader = new SpaceInvader();
        spaceInvader.moveLeft();
        spaceInvader.moveRight();
    }
}

