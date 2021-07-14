//given two strings, write a method to decide if one is a permuation of other
package com.chapter1._0002;

public class Solution {
    public static void main(String[] args) {
        String s1 = "ramya iyer";
        String s2 = "iyer ramya";
        boolean isPermutation = isPermutation(s1,s2);
        System.out.println(isPermutation);
    }

    private static boolean isPermutation(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        int[] characters = new int[128];
        for(int i=0; i<s1.length(); i++) {
            int p = s1.charAt(i);
            characters[p] = 1;
        }
        for(int i=0; i< s2.length(); i++) {
            int p = s2.charAt(i);
            if(characters[p] == 0)
                return false;
        }
        return true;
    }
}
