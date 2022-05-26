package com.sohail.search.binary_search;

import javax.swing.plaf.nimbus.State;

public class CeilingProblem {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 20;
        int result = ceiling(arr,target);
        System.out.println(result);
    }

     static int ceiling(int[] arr, int target) {
        if (target > arr[arr.length-1]){
            return -1;
        }
        int start = 0, end = arr.length-1;
        while (start <= end){
        int mid =(start+end)/2;
            if (target > arr[mid]){
                start = mid+1;
            }else if (target < arr[mid]) {
                end = mid - 1;
            } else return arr[mid];

        }
        return arr[start];
    }
}
