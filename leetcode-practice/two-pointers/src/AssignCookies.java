//455. Assign Cookies
//https://leetcode.com/problems/assign-cookies/description/

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int gInd = 0, sInd = 0;

        while(gInd < g.length && sInd < s.length){
            if(g[gInd] <= s[sInd]){
                gInd++;
            }
            sInd++;
        }

        return gInd;
    }
}
