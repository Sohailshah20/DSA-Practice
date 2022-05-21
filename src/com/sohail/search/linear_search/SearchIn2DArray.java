package com.sohail.search.linear_search;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,5},
                {2,4,6,8,10},
                {7,9,11,13,99}
        };

        int target = 6;
        int[] result = Search(arr, target);
        System.out.println(Arrays.toString(result));
    }
    static int[] Search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
            
        }
        return new int[]{-1,-1};
    }
}
