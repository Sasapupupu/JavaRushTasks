package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputRadius = scanner.nextInt();
        double pi = 3.14;

        int S = (int) (pi * (inputRadius * 1.0 * inputRadius));
        System.out.println(S);
    }
}