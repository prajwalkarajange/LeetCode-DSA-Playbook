class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int prefixSum = 0;
        int ans = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int num : nums) {
            prefixSum = prefixSum + num;

            int reminder = prefixSum % k;

            if (reminder < 0) {
                reminder = reminder + k;
            }

            if (map.containsKey(reminder)) {
                ans = ans + map.get(reminder);
            }

            map.put(reminder, map.getOrDefault(reminder, 0) + 1);
        }

        return ans;
    }
}