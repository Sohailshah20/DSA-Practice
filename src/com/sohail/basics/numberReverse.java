package com.sohail.basics;

public class numberReverse {
    public static void main(String[] args) {
        int a = 12345;
        int num = 0 ;
        while (a > 0 ){
            int rem = a%10;
            num = num * 10 + rem;
            a = a/10;
        }
        System.out.println(num);
    }
}
