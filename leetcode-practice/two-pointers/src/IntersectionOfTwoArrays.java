//349. Intersection of Two Arrays
//https://leetcode.com/problems/intersection-of-two-arrays/description/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> resList = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();

        for(int num : nums1){
            set1.add(num);
        }


        for(int num : nums2){
            if(set1.contains(num) && !resList.contains(num)){
                resList.add(num);
            }
        }

        int[] res = new int[resList.size()];
        for(int i=0;i<resList.size();i++){
            res[i] = resList.get(i);
        }

        return res;
    }
}
