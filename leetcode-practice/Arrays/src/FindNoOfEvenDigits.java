//1295. Find Numbers with Even Number of Digits
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class FindNoOfEvenDigits {
    public int findNumbers(int[] nums) {
        int even = 0;
        for (int i=0;i<nums.length;i++){
            if(((int)Math.log10(nums[i]) + 1) % 2 == 0) {
                even++;
            }
        }
        return even;
    }
}
