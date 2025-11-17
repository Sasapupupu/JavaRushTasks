package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        while (scanner.hasNextInt()) {
            int inputNumber = scanner.nextInt();
            if (inputNumber < min) {
                secondMin = min;
                min = inputNumber;
            } else if (inputNumber > min && inputNumber < secondMin) {
                secondMin = inputNumber;
            }
        }
        System.out.println(secondMin);
    }
}