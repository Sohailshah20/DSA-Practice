package com.sohail.search.linear_search;

import java.lang.annotation.Target;

public class RangeSearch {
    public static void main(String[] args) {
        int[] arr = {1,5,4,8,9,6,3,55,77,66,23,14,25};
        int target = 1;
        boolean result = RangeSearch(arr, 3, 9, target);
        System.out.println(result);
    }
    static boolean RangeSearch(int[] arr, int startIndex, int endIndex, int target){
        if (arr.length != 0){
            for (int i = startIndex; i <= endIndex; i++) {
                int element = arr[i];
                if (element == target) return true;
            }
        }
        return false;
    }
}
