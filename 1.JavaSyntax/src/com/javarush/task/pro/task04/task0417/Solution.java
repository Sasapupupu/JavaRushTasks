package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputSpeed = scanner.nextInt();

        int newSpeed = (int) Math.round(inputSpeed * 3.6);
        System.out.println(newSpeed);
    }
}