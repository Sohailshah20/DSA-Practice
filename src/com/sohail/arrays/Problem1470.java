package com.sohail.arrays;

import java.util.Arrays;

public class Problem1470 {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = nums.length/2;
        int[] result= runningSum(nums, n);
        System.out.println(Arrays.toString(result));
}

    static int[] runningSum(int[] nums, int n){
        int[] ans = new int[2*n];
        int even = 0, odd = n;
        for (int i = 0; i < ans.length; i++) {
            if (i%2 == 0) ans[i] = nums[even++];
            else ans[i] = nums[odd++];
        }
        return ans;
        }
    }
