//345. Reverse Vowels of a String
//https://leetcode.com/problems/reverse-vowels-of-a-string/submissions/2035894950/

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEIOU";

        while (start < end) {
            while (start < end && vowels.indexOf(word[start]) == -1) {
                start++;
            }

            while (start < end && vowels.indexOf(word[end]) == -1) {
                end--;
            }

            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;

            start++;
            end--;
        }

        // String answer = new String(word);
        return new String(word);
    }
}
