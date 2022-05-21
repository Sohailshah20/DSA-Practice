package com.sohail.search.linear_search;

public class CharSearch {
    public static void main(String[] args) {
        String name = "";
        char target = 'k';
        boolean result = SearchChar(name,target);
        System.out.println(result);
    }
    static boolean SearchChar(String str, char target){
        if (str.length() != 0){
            for (char ch : str.toCharArray()) {
                if (ch == target) return true;
            }
        }
        return false;
    }
}
