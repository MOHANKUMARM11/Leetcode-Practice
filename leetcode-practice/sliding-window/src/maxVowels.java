//1456. Maximum Number of Vowels in a Substring of Given Length
//https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/

public class maxVowels {
    class Solution {
        public static boolean isvowel(char c){
            return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
        }
        public int maxVowels(String s, int k) {
            int c=0;
            for(int i=0;i<k;i++){
                if(isvowel(s.charAt(i))){
                    c++;
                }
            }
            int max=c;
            for(int i=k;i<s.length();i++){
                if(isvowel(s.charAt(i-k))){
                    c--;
                }
                if(isvowel(s.charAt(i))){
                    c++;
                }
                max=Math.max(max,c);
                if (max==k) return max;
            }
            return max;
        }
    }
}
