package com.sohail.basics;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year ");
        int year = input.nextInt();
//        boolean leapYear = ((year%4 == 0 && year%100 != 0) && (year%400 == 0 && year%100 == 0));
        if (year%4 == 0 && year%100 != 0){
            System.out.println("the year "+ year + " is a leap year");
        }
        else if (year%400 == 0 && year%100 == 0){
            System.out.println("the year "+ year + " is a leap year");
        } else {
            System.out.println("the year "+ year + " is a not leap year");
        }
    }
}
