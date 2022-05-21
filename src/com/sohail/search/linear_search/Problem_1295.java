package com.sohail.search.linear_search;

import kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt;

//Given an array nums of integer,
// return how many of them contain even number of digits
public class Problem_1295 {

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896,0,-12};
        int result = evenDigits(nums);
        System.out.println(result);
    }
    static int evenDigits(int[] arr){
        int evenDigits = 0;
        if (arr.length != 0){
            for (int num : arr) {
                if (even(num)){
                    evenDigits++;
                }
            }
        }
        return evenDigits;
    }

    static boolean even(int num){
        int digits = digits(num);
        return digits%2 == 0;
    }

    static int digits(int num){
        if (num ==0) return 1;
        return (int)(Math.log10(num) + 1);
    }
        //By converting to string
//    private static boolean even(int num) {
//        String stringNum = Integer.toString(num);
//        if (stringNum.length()%2 == 0 ) return true;
//        return false;
//    }
}
