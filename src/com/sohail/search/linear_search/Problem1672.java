package com.sohail.search.linear_search;

public class Problem1672 {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,5},
                {7,3},
                {3,5}
        };
        int result = richestCustomer(accounts);
        System.out.println(result);
    }

    private static int richestCustomer(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int row = 0; row < accounts.length; row++) {
            int sum = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                sum += accounts[row][col];
                System.out.println(sum);
            }
            if (maxWealth < sum){
                maxWealth = sum;
            }
        }
        return maxWealth;
    }

}
