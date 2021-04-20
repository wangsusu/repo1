package com.susu;

public class Test {

    public int handle(int num){
        int result = 0;
        int i = num;
        while(i!=0){
            i = i/10*10;
            result = result *10 + num - i;
            i = i/10;
            num = num/10;
        }
        return result;
    }

    public static void main(String[] args) {
        Test t = new Test();
        int num = t.handle(12354);
        System.out.println(num);

    }
}
