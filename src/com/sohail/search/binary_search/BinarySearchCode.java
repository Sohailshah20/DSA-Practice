package com.sohail.search.binary_search;

public class BinarySearchCode {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int target = 11;
        int result = binarySearch(arr,target);
        System.out.println(result);
    }

     static int binarySearch(int[] arr, int target) {
        int startIndex = 0;
        int endIndex = arr.length -1;
         while (startIndex <= endIndex){
             int middle = startIndex + (endIndex-startIndex)/2 ;
             if (target > arr[middle]){
                 startIndex = middle + 1;
             }else if (target < arr[middle]){
                 endIndex = middle -1;
             } else return middle;
         }
         return -1;
    }
}
