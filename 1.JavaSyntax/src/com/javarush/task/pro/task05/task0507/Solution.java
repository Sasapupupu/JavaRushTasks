package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int inputArrayNumber = scanner.nextInt();
        array = new int[inputArrayNumber];
        for (int i = 0; i < inputArrayNumber; i++) {
            int inputArrayInfo = scanner.nextInt();
            array[i] = inputArrayInfo;
        }

        int maxArrayInfo = array[0];
        for (int j = 0; j < inputArrayNumber; j++) {
            if (maxArrayInfo<array[j]) {
                maxArrayInfo = array[j];
            }
        }
        System.out.println(maxArrayInfo);
    }
}
