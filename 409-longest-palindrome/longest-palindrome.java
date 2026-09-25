import java.util.*;

class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean odd = false;

        for (int num : map.values()) {

            if (num % 2 == 0) {
                length += num;
            } else {
                length += num - 1;
                odd = true;
            }
        }

        if (odd) {
            length++;
        }

        return length;
    }
}