//217. Contains Duplicate
//https://leetcode.com/problems/contains-duplicate/

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            if(!set.contains(num)){
                set.add(num);
            } else {
                return true;
            }
        }

        return false;
    }
}
