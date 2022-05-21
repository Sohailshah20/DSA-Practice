package com.sohail.basics;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        System.out.println(ArmStrong(number));
    }

    static boolean ArmStrong(int number) {
        int original = number;
        int sum = 0;
        while (number > 0){
            int rem = number%10;
            int cube = rem * rem * rem;
            sum += cube;
            number = number/10;
        }
        return original == sum;

    }
}
