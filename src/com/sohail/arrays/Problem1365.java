package com.sohail.arrays;

import java.util.Arrays;

public class Problem1365 {
    public static void main(String[] args) {
        int[] nums = {6,5,4,8};
        int[] result = numbersSmaller(nums);
        System.out.println(Arrays.toString(result));
    }

    static int[] numbersSmaller(int[] nums) {
        int count = 0;
        int[] result = new int[nums.length];
        for (int k = 0; k < nums.length; k++) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[k] < nums[i]){
                    count++;
                }
            }
            result[k] = count;
            count = 0;
        }
        return result;
    }
}

