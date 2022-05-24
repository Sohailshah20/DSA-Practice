package com.sohail.arrays;

import java.util.Arrays;

public class ConcatenationOfArray1929 {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] result= concatArray(nums);
        System.out.println(Arrays.toString(result));

    }

    static int[] concatArray(int[] nums){
        int n = nums.length;
      int[] ans = new int[2*n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}

