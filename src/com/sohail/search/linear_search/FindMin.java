package com.sohail.search.linear_search;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {9,23,8,7,77,5,66,6,2,45,5,4,541};
        int result = findMin(arr);
        System.out.println(result);

    }
    static int findMin(int[] arr){
        if (arr.length != 0){
            int min = arr[0];
            for (int num : arr) {
                if (num < min) {
                    min = num;
                }
            }
            return min;
        }
        return -1;
    }
}
