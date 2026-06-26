//1652. Defuse the Bomb
//https://leetcode.com/problems/defuse-the-bomb/description/

import java.util.Arrays;

class Solution {
    public int[] decrypt(int[] code, int k) {
        int arr[]=new int [code.length];
        int st=0;
        int en=0;
        int n=code.length;
        if(k==0){
            Arrays.fill(arr, 0);
            return arr;
        }
        if(k>0){
            st=1;
            en=k;
        }
        if(k<0){
            st=n+k;
            en=n-1;
        }
        int s=0;
        for(int i=st;i<=en;i++){
            s+=code[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i]=s;
            s-=code[st%n];
            st++;
            en++;
            s+=code[en%n];
        }
        return arr;
    }
}