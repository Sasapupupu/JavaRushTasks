package com.javarush.task.pro.task08.task0809;

/* 
Counter

*/
public class Solution {

    public static void main(String[] args) throws InterruptedException {
        printNumbers();
    }

    public static void printNumbers() throws InterruptedException {
        System.out.println(1);
        for (int i = 1; i <= 9; i++) {
            Thread.sleep(1L,300000);
            System.out.println(i+1);
        }
    }
}
