package com.susu.dayup;

import java.util.Scanner;

public class Test {
    /**
     * 2
     * 3
     * 1 1 1
     * 6
     * 1 1 0 1 0 1
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int j=0; j<n; j++){
                a[j] = sc.nextInt();
            }

            int max = 0;
            for(int k = 0; k< n; k++){
                int leftCount = 0;
                int rightCount = 0;
                int l = k -1;
                while(l>0 && a[l]==1){
                    leftCount ++;
                    l--;
                }
                int r = k+1;
                while(r<n && a[r]==1 ) {
                    rightCount++;
                    r++;
                }
                if(a[k]==0){
                    max = Math.max(max,leftCount+rightCount+1);
                }else{
                    max = Math.max(max,leftCount+rightCount);
                }
            }
            System.out.println(max);
        }

    }
}
