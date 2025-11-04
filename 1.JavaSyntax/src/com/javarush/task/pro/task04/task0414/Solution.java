package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        int inputInt = scanner.nextInt();

        do {
            System.out.println(inputLine);
            inputInt--;
        } while (inputInt > 0 && inputInt < 4);

    }
}