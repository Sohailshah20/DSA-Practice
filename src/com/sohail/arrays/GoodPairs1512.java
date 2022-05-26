package com.sohail.arrays;

import java.util.ArrayList;
import java.util.List;

public class GoodPairs1512 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int result = goodPairs(nums);
        System.out.println(result);
    }

    static int goodPairs(int[] nums) {
        int i = 0, j = nums.length-1;
        int count = 0;
        while(i<=j){
            if(nums[i] == nums[j] && i<j){
                count++;
                j--;
            }
            else if(nums[i] != nums[j]){
                j--;
            }
            else if(i == j){
                i++;
                j = nums.length-1;
            }
        }
        return count;
    }
}

