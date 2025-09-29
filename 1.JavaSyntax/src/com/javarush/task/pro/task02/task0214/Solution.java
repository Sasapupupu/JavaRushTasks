package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String FirstLine = keyboard.nextLine();
        String SecondLine = keyboard.nextLine();
        String ThirdLine = keyboard.nextLine();

        System.out.println(ThirdLine);
        System.out.println(SecondLine.toUpperCase());
        System.out.println(FirstLine.toLowerCase());

    }
}
