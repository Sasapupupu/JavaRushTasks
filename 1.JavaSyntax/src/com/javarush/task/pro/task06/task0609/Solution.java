package com.javarush.task.pro.task06.task0609;

/* 
Кубический калькулятор в кубе
*/

public class Solution {
    public static void main(String[] args) {
        long cubeInCube = 3;
        System.out.println(cube(ninthDegree(cubeInCube)));
    }

    public static long cube(long a) {
        return (a * a * a);
    }

    public static long ninthDegree(long inputLong) {
        long cube = cube(inputLong);
        long output = cube(cube);
        return output;
    }
}
