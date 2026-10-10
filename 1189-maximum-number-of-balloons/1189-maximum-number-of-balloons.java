class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> have = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();

        for (char ch : text.toCharArray()) {
            have.put(ch, have.getOrDefault(ch, 0) + 1);
        }
        String s = "balloon";
        for (char ch : s.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        int result = Integer.MAX_VALUE;

        for (char ch : need.keySet()) {
            int available = have.getOrDefault(ch, 0);
            int required = need.get(ch);

            result = Math.min(result, available / required);

        }

        return result;

    }
}