package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scanner = new Scanner(System.in);
        boolean inputMism = scanner.nextBoolean();

        if (inputMism = false) {
            int Optimism = (int) Math.floor(glass);
            System.out.println(Optimism);
        } else if (inputMism = true) {
            int Pessimism = (int) Math.ceil(glass);
            System.out.println(Pessimism);
        }

    }
}