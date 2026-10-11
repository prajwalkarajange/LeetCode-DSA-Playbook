class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int length = 0;
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);

        }
        boolean oddFound = false;
        for (int count : map.values()) {
            length = length + (count / 2) * 2;

            if (count % 2 == 1) {
                oddFound = true;
            }
        }
        if (oddFound) {
            length += 1;
        }
        return length;
    }
}