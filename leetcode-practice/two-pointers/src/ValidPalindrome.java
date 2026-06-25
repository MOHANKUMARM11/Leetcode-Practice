//125. Valid Palindrome
//https://leetcode.com/problems/valid-palindrome/description/

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while(l < r) {
            while(l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }

            while(l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }

            char lChar = Character.toLowerCase(s.charAt(l));
            char rChar = Character.toLowerCase(s.charAt(r));

            if(lChar != rChar) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}
