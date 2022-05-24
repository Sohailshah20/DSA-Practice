package com.sohail.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtraCandies1431 {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int[] candiesSum = new int[candies.length];
        List<Boolean> result = new ArrayList<Boolean>();
        int maxCandies = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxCandies){
                maxCandies = candies[i];
            }
        }
        for (int j = 0; j < candies.length; j++) {
            int sum = candies[j] + extraCandies;
            if (sum >= maxCandies){
                result.add(true);
            }else {
                result.add(false);
            }
        }
            return result;
    }

}

