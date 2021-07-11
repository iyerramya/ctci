// implement an algorithm to determine if a atring has all unique characters.

package com.chapter1;

public class _1isUnique {
    public static class isUnique11 {
        public static void main(String[] args) {
            String str = "ramyA";
            boolean isUnique = isUnique(str);
            System.out.println(isUnique);
        }

        private static boolean isUnique(String str) {
            boolean[] isChar = new boolean[128];
            for(int i = 0; i<str.length(); i++) {
                int val = str.charAt(i);
                if(isChar[val] == true)
                    return false;
                isChar[val] = true;
            }
            return true;
        }
    }
}
