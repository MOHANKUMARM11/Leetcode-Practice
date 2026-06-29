//70. Climbing Stairs
//https://leetcode.com/problems/climbing-stairs/

class Solution {
    public int climbStairs(int n) {
        if(n==0||n==1||n==2){
            return n;
        }
        int a=1,b=2;
        for(int i=3;i<=n;i++){
            int s=a+b;
            a=b;
            b=s;
        }
        return b;
    }
}