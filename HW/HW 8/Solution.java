/**
 * Christopher Oh
 * SJSU CS 146
 * HW 8 - Longest Palindrome
 */

import java.util.HashMap;

public class Solution {
    public Solution() {}

    public int longestPalindrome (String s) {
        int length = 0;
        HashMap<Character, Integer> freq = new HashMap<>(); //letter frequency
        
        for (int i = 0; i < s.length(); i++) {
            if (freq.containsKey(s.charAt(i))) { //map contains character
                freq.put(s.charAt(i), freq.get(s.charAt(i)) + 1);
                if (freq.get(s.charAt(i)) % 2 == 0) { //character has appeared an even amount
                    freq.put(s.charAt(i), 0);
                    length = length + 2;
                }
            } else {
                freq.put(s.charAt(i), 1);
            }
        }

        if (freq.containsValue(1)) length++;

        return length;
    }
}
