package com.susu.dayup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//输入：nums = [-1,0,1,2,-1,-4]
//输出：[[-1,-1,2],[-1,0,1]]
public class Solution5 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        //排序
        Arrays.sort(nums);
        //遍历
        for(int i = 0 ; i < nums.length; i++){
            if(i == 0 || nums[i] != nums[i-1]){
                int start = i+1 ; int end = nums.length -1 ;
                while(start<end){
                    if(nums[i] + nums[start] + nums[end] ==  0){

                        List<Integer> tempList = new ArrayList<Integer>();
                        tempList.add(nums[i]);
                        tempList.add(nums[start]);
                        tempList.add(nums[end]);
                        result.add(tempList);

                        start ++ ;
                        end -- ;
                        while (start<end && nums[start] == nums[start-1]){
                            start ++;
                        }
                        while (start<end && nums[end] == nums[end + 1]){
                            end --;
                        }
                    }else if(nums[i] + nums[start] + nums[end] <  0){
                        start ++ ;
                    }else{
                        end --;
                    }
                }
            }
        }
        return result;
    }

   /* public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        Solution5 solu = new Solution5();
        List<List<Integer>> result = solu.threeSum(nums);
        System.out.println(result);
    }*/
}
