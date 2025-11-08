package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int height = 10;
        while (height>0) {
            int width = 20;
            while (width > 0) {
                if (height == 10 || height == 1) {
                    System.out.print("Б");
                } else if (width == 20 || width == 1) {
                    System.out.print("Б");
                } else {
                    System.out.print(" ");
                }
                width--;
            }
            System.out.println();
            height--;
        }
    }
}