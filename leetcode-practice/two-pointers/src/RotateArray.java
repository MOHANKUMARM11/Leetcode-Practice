//189. Rotate Array
//https://leetcode.com/problems/rotate-array/description/

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] rotated = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            rotated[(i+k)%nums.length] = nums[i];
        }

        for(int i=0;i<nums.length;i++){
            nums[i] = rotated[i];
        }

//        public void rotate(int[] nums, int k) {
//            int n = nums.length;
//            k = k % n;
//            reverse(nums, 0, n-1);
//            reverse(nums, 0, k-1);
//            reverse(nums, k, n-1);
//        }
//
//        private void reverse(int[] nums, int s, int e) {
//            while(s < e) {
//                int temp = nums[s];
//                nums[s] = nums[e];
//                nums[e] = temp;
//                s++;
//                e--;
//            }
//        }
    }
}
