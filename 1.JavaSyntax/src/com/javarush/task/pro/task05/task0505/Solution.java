package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int[] array = new int[inputNumber];
        for (int i = 0; i < inputNumber; i++) {
            int input = scanner.nextInt();
            array[i] = input;
        }

        if (inputNumber % 2 == 0) {
            for (int i = inputNumber - 1; i >= 0; i--) {
                System.out.println(array[i]);
            }
        } else {
            for (int i = 0; i < inputNumber; i++) {
                System.out.println(array[i]);
            }
        }
    }
}
