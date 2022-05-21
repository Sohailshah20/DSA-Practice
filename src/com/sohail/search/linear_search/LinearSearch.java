package com.sohail.search.linear_search;

import java.lang.reflect.Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,5,62,4,85,84,61,9,64,3,1,3,15,1};
        int result = linearSearch(arr, 1);
        System.out.println(result );
    }

    static int linearSearch(int[] arr, int element){
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element){
                return i;
            }
        }
        return -1;
    }
}
