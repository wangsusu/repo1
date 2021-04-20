package com.susu.dayup;

import java.util.HashMap;

public class Solution4 {
    public int[] twoSum(int[] nums, int target) {
        //HashMap map = new HashMap();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] attr = new int[2];
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                attr[0] = i ;
                attr[1] = map.get(complement);
            }else{
                map.put(nums[i],i);
            }
        }
        return attr;
    }
}
