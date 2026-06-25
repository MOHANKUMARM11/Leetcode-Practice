//485. Max Consecutive Ones
//https://leetcode.com/problems/max-consecutive-ones/solutions/7778065/video-simple-counting-and-sliding-window-kiuo/
public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int count = 0;

        for (int n : nums) {
            if (n == 0) {
                count = 0;
            } else {
                count++;
            }

            if (res < count) {
                res = count;
            }
        }

        return res;
    }
}
