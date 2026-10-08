import java.util.*;

class Solution {
    public int longestSubstring(String s, int k) {

        int max = 0;

       
        for (int distinct = 1; distinct <= 26; distinct++) {

            HashMap<Character, Integer> map = new HashMap<>();

            int left = 0;
            int right = 0;

            int unique = 0;
            int atLeastK = 0;

            while (right < s.length()) {

                char ch = s.charAt(right);

                map.put(ch, map.getOrDefault(ch, 0) + 1);

                if (map.get(ch) == 1) {
                    unique++;
                }

                if (map.get(ch) == k) {
                    atLeastK++;
                }

                while (unique > distinct) {

                    char leftChar = s.charAt(left);

                    if (map.get(leftChar) == k) {
                        atLeastK--;
                    }

                    map.put(leftChar, map.get(leftChar) - 1);

                    if (map.get(leftChar) == 0) {
                        map.remove(leftChar);
                        unique--;
                    }

                    left++;
                }

                
                if (unique == distinct && atLeastK == distinct) {
                    max = Math.max(max, right - left + 1);
                }

                right++;
            }
        }

        return max;
    }
}