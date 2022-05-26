package com.sohail.search.binary_search;

public class Problem744 {
    public static void main(String[] args) {
        char[] arr = {'e','e','e','e','e','e','n','n','n','n','e'};
        char target = 'e';
        char result = charCeiling(arr,target);
        System.out.println(result);
    }

     static char charCeiling(char[] letters, char target) {
        int start = 0 , end = letters.length-1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if (target < letters[mid]){
                end = mid-1;
            }else {
                start = mid + 1;
            }
        }
        return letters[start%letters.length];
    }
}
