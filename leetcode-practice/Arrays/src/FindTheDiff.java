import java.util.HashMap;
import java.util.Map;

//389. Find the Difference
//https://leetcode.com/problems/find-the-difference/description/
public class FindTheDiff {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> count = new HashMap<>();

        for (char c : t.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            count.put(c, count.get(c) - 1);
            if (count.get(c) == 0) {
                count.remove(c);
            }
        }

        return (char) count.keySet().toArray()[0];
    }
}
