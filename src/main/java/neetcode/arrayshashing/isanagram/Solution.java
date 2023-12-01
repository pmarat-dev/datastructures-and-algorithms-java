package neetcode.arrayshashing.isanagram;

import java.util.Arrays;

import static java.lang.System.out;

public class Solution {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int n : store)
            if (n != 0) return false;

        return true;
    }

    public static void main(String[] args) {
        String[] words = new String[]{"rat", "car"};
        out.format("Is anagram (%s): %s.%n", Arrays.toString(words), isAnagram(words[0], words[1]));

        words = new String[]{"anagram", "nagaram"};
        out.format("Is anagram (%s): %s.%n", Arrays.toString(words), isAnagram(words[0], words[1]));
    }
}
