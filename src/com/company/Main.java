package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner keboard = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number");
        num = keboard.nextInt();
        int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int y = 0; y < num1.length; y++) {
            System.out.println(num1[y]);
        }
    }
}
