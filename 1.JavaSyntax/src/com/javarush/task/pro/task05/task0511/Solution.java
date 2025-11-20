package com.javarush.task.pro.task05.task0511;

import java.util.Arrays;
import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputArrayLength = scanner.nextInt();
        multiArray = new int[inputArrayLength][];
        for (int i = 0; i < inputArrayLength; i++) {
            int inputNumber = scanner.nextInt();
            multiArray[i] = new int[inputNumber];
        }
        System.out.println(Arrays.deepToString(multiArray));
    }
}
