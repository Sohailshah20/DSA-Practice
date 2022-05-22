package com.sohail.search.binary_search;

public class Order_AgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {20,19,18,17,16,15,14,13,12,11,10};
        int target = 20;
        int result = binarySearch(arr,target);
        System.out.println(result);
    }
    static int binarySearch(int[] arr, int target) {
        int startIndex = 0;
        int endIndex = arr.length -1;
        boolean isAscending = arr[startIndex] < arr[endIndex];
        while (startIndex <= endIndex){
            int middle = startIndex + (endIndex-startIndex)/2 ;
            if (target == arr[middle]){
                return middle;
            }
            if (isAscending) {
                if (target > arr[middle]) {
                    startIndex = middle + 1;
                } else {
                    endIndex = middle - 1;
                }
            }else {
                    if(target < arr[middle]){
                        startIndex = middle + 1;
                    }else {
                        endIndex = middle -1;
                    }

            }
        }
        return -1;
    }

}
