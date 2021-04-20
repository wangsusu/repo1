package com.susu;

import java.util.*;

public class Main2 {

    public void solution(){
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        HashMap<Character,Integer> map = new HashMap();
        for(int i = 0; i<str1.length(); i++){
            if(map.containsKey(str1.charAt(i))){
                map.put(str1.charAt(i),map.get(str1.charAt(i))+1);
            }else{
                map.put(str1.charAt(i),1);
            }
        }
        int max = 0;
        for(char key :map.keySet()){
            int value = map.get(key);
            if(value>max){
                max = value;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Main2 one = new Main2();
        one.solution();
    }
}
