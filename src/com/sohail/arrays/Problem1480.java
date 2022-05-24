package com.sohail.arrays;

import java.util.Arrays;

public class Problem1480 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result= runningSum(nums);
        System.out.println(Arrays.toString(result));
    }

    static int[] runningSum(int[] nums){
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                ans[i] += nums[j];
            }
        }
        return ans;
    }
}
