package com.susu.dayup;

import java.util.HashMap;
import java.util.Stack;

public class Solution20 {

    public boolean isValid(String s) {

        Boolean result = true;
        HashMap map = new HashMap();
        map.put("{","}");
        map.put("(",")");
        map.put("[","]");

        Stack stack = new Stack();
        for(int i = 0 ; i < s.length(); i++){
            System.out.println(s.charAt(i));
            if(map.containsKey(s.charAt(i))){
                System.out.println("111");
                stack.push(map.get(s.charAt(i)));
            }else{
                if(stack.isEmpty() == false && !stack.pop().equals(s.charAt(i))){
                    System.out.println("222");
                    result = false;
                }
            }
        }
        if(stack.isEmpty()==false){
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
//        Solution20 solu = new Solution20();
////        String s = "[]{}";
////        String s = "{[]}";
//        String s = "([)]";
//
//        Boolean flag = solu.isValid(s);
//        System.out.println(flag);

        Boolean result = true;
        HashMap<String,String> map = new HashMap<>();
        String p1 = "{"; String p11 = "}";
        String p2 = "["; String p22 = "]";
        String p3 = "("; String p33 = ")";
        map.put(p1,p11);
        map.put(p2,p22);
        map.put(p3,p33);
        String s= "([)]";
        System.out.println("\""+s.charAt(0)+"\"");
        System.out.println(map.get(s.charAt(0)));
        Boolean flag = map.containsKey("\""+s.charAt(0)
                +"\"");
        System.out.println(flag);
    }
}
