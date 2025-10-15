package com.javarush.task.pro.task03.task0310;

import java.util.Scanner;

/* 
Через тернии...
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String result1 = "число меньше 5"; String result2 = "число больше 5";String result3 = "число равно 5";

        if (number < 5) {
            System.out.println(result1);
        } else if (number > 5) {
            System.out.println(result2);
        } else
            System.out.println(result3);
    }
}
