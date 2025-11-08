package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3
*/

public class Solution {
    public static void main(String[] args) {
        int sum = 0;
        int count = 1;
        while (count<=100) {
            if (count%3==0) {
                count++;
                continue;
            }
            sum = sum + count;
            count++;
        }
        System.out.println(sum);
    }
}