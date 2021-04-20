package com.susu.dayup;

public class Solution3 {
    public int maxLength = 1;
    public int start = 0;
    public String longestPalindrome(String s) {
        if(s.length()<2){
            return s;
        }

        for(int i = 0; i< s.length();i++){
            expandAroundCenter(i-1,i+1,s);
            expandAroundCenter(i,i+1,s);
        }
        return s.substring(start,start + maxLength);
    }

    public void expandAroundCenter(int left, int right,String s){
        while(left>=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            if(right - left + 1 > maxLength){
                maxLength = right - left + 1;
                start = left;
            }
            left--;
            right++;
        }
    }

    public static void main(String[] args) {
        String s = "ac";
        Solution3 solu = new Solution3();
        String str = solu.longestPalindrome(s);
        System.out.println(str);
    }


}
