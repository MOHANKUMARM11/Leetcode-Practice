//2529. Maximum Count of Positive Integer and Negative Integer
//https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/
public class MaxCntOfPosAndNegNumbers {
    public int maximumCount(int[] nums) {
        int neg = 0;
        int pos = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < 0) {
                neg++;
            }
            if(nums[i] > 0) {
                pos++;
            }
        }
        return Math.max(neg, pos);
    }
//    public int maximumCount(int[] nums) {
//        int pos = posIndex(nums);
//        int neg = negIndex(nums);
//        return Math.max(pos, neg);
//    }
//
//    public int posIndex(int[] nums){
//        int start = 0;
//        int end = nums.length - 1;
//
//        while(start <= end) {
//            int mid = start + (end - start) / 2;
//            if (nums[mid] > 0){
//                end = mid - 1; //First neg number may reside in left side.
//            } else {
//                start = mid + 1;
//            }
//        }
//
//        return nums.length - start;
//    }
//
//    public int negIndex(int[] nums){
//        int start = 0;
//        int end = nums.length - 1;
//
//        while(start <= end) {
//            int mid = start + (end - start) / 2;
//            if (nums[mid] < 0){
//                start = mid + 1; //First neg number may reside in right side.
//            } else {
//                end = mid - 1;
//            }
//        }
//
//        return start;
//    }
}
