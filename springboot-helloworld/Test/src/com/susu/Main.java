package com.susu;

import java.util.*;

public class Main {

    public void solution(){
        Scanner in = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        StringBuffer newSB = new StringBuffer();
        String[] array = new String[100];
        String str1 = in.next();
        String str2 = in.next();
        sb.append(str1).append(",").append(str2);
        array = sb.toString().split(",");
        List list = Arrays.asList(array);
        //System.out.println(list);
        Collections.sort(list);
        // System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        //System.out.println(list);
        Object[] obj = list.toArray();
        for (Object o: obj) {
            newSB.append(o).append(",");
        }
        newSB.delete(newSB.length()-1,newSB.length());
        System.out.println(newSB);

    }

    public static void main(String[] args) {
        Main one = new Main();
        one.solution();
    }
}