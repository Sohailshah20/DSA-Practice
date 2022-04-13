package com.sohail;

public class occurance {
    public static void main(String[] args) {
        int a = 878578843;
        int num = 0;
        while (a > 0){
            int rem = a%10;
            if (rem == 8){
                num++;
            }
                a = a/10;
        }
        System.out.println(num);
    }
}
