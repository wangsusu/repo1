package com.susu.dayup;

import java.util.HashSet;

public class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        HashSet set = new HashSet();
        int i = 0, j= 0, maxLength = 0;
        if(s.length() == 0){
            return 0;
        }
        for( i=0; i< s.length(); i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                maxLength = Math.max(maxLength,set.size());
            }else{
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(j));
                    j++;
                }
                set.add(s.charAt(i));
            }
        }
        return maxLength;
    }
}
