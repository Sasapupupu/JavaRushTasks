package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

public class Solution {
    public static void main(String[] args) {
        long cube = 3;
        System.out.println(cube(cube));
    }

    public static long cube(long inputLong) {
        long cubic = inputLong;
        for (int i = 0; i < 2; i++) {
            cubic = cubic * inputLong;
        }
        return cubic;
    }
}
