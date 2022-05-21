package com.sohail.basics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.println("Enter the limit");
        int n = input.nextInt();
        System.out.print(firstNumber + " " + secondNumber + " ");
        for (int i = 0; i < n; i++) {
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            System.out.print(nextNumber + " ");

        }
    }
}
