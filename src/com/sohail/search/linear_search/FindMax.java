package com.sohail.search.linear_search;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {9,23,8,7,77,5,66,6,2,45,5,4,541};
        int result = findMax(arr);
        System.out.println(result);

    }
    static int findMax(int[] arr){
        if (arr.length != 0){
            int max = arr[0];
            for (int num : arr) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }
        return -1;
    }
}

