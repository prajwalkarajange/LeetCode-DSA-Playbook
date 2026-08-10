class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0;
        int n = s.length();
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int high = 0; high < n; high++) {
            int k = high - low + 1;
            char c = s.charAt(high);

            map.put(c, map.getOrDefault(c, 0) + 1);

            while (map.size() < k) {

                char lch = s.charAt(low);

                map.put(lch, map.get(lch) - 1);

                if (map.get(lch) == 0) {
                    map.remove(lch);
                }
                low++;

                k = high - low + 1;

            }
            int len = high - low + 1;
            res = Math.max(res, len);
        }
        return res;
    }
}