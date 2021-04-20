package com.susu;

import java.util.*;

public class One {
//    public void test1(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
//            int a = in.nextInt();
//            int b = in.nextInt();
//            System.out.println(a + b);
//        }
//    }
//
//    public void test2(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int ans = 0, x;
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < n; j++){
//                x = sc.nextInt();
//                ans += x;
//            }
//        }
//        System.out.println(ans);
//    }

    public void solution(){
        Scanner in = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
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
        System.out.println(list);
    }

    public static void main(String[] args) {
        One one = new One();
        one.solution();
    }
}
