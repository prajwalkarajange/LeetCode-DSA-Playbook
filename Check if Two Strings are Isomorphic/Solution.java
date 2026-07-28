import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "xxy";

        if (s1.length() != s2.length()) {
            System.out.println("false");
            return;
        }

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (map1.containsKey(c1)) {
                if (map1.get(c1) != c2) {
                    System.out.println("false");
                    return;
                }
            } else {
                if (map2.containsKey(c2)) {
                    System.out.println("false");
                    return;
                }
            }
            map1.put(c1, c2);
            map2.put(c2, c1);
        }
        System.out.println("true");

    }
}
