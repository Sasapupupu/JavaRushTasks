package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];
        for (int j = 0; j < strings.length; j++) {
            String inputLine = scanner.nextLine();
            strings[j] = inputLine;
        }

        for (int k = 0; k < strings.length; k++) {
            for (int g = 0; g < ; g++) {
                
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
