//1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
//https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/

class Solution {
    public static boolean avgthres(int sum,int k,int t){
        return ((double) sum/k)>=t;
    }
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int s=0;
        int c=0;
        for(int i=0;i<k;i++){
            s+=arr[i];
        }
        if(avgthres(s,k,threshold)){
            c++;
        }
        for(int i=k;i<arr.length;i++){
            s=(s-arr[i-k])+arr[i];
            if(avgthres(s,k,threshold)){
                c++;
            }
        }
        return c;
    }
}