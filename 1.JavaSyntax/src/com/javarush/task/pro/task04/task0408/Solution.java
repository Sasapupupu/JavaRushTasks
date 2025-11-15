package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxValue = Integer.MIN_VALUE;
        while (scanner.hasNextInt()) {
            int inputNumber = scanner.nextInt();
            if (inputNumber > maxValue && inputNumber % 2 == 0) {
                maxValue = inputNumber;
            }
        }
        System.out.println(maxValue);
    }
}