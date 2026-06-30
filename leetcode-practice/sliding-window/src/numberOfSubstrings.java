//1358. Number of Substrings Containing All Three Characters
//https://leetcode.com/problems/number-of-substrings-containing-all-three-characters

class Solution {
    public int numberOfSubstrings(String s) {
        int[] count = new int[3];
        int res = 0;
        int left = 0;
        int n = s.length();
        for (int right = 0; right < n; right++) {
            count[s.charAt(right) - 'a']++;
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                res += n - right;
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return res;
    }
}
