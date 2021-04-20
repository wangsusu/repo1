package com.susu;

import java.util.*;

public class Main3 {

    public void solution(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       // int x;
        int sumH = 0;
        int sumS = 0;
        int array[][] = new int[100][100];
        List<Integer> listH = new ArrayList<Integer>();
        List<Integer> listS = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                array[i][j] = in.nextInt();
                sumH += array[i][j];
            }
            listH.add(sumH);
        }
        //竖行
        for(int j = 0; j < n; j++){
            for(int i = 0; i< n; i++){
                //System.out.println(array[i][j]);
                sumS += array[i][j];
            }
            listS.add(sumS);
        }
        //横行
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                //System.out.println(array[i][j]);
            }
        }
//        Collections.sort(listS);
//        Collections.sort(listH);
//        int maxH = listH.get(listH.size()) ;
//        int maxS = listS.get(listS.size()) ;
        int maxH = listH.get(0);
        int maxS = listS.get(0);
        for(int i = 0;i<listH.size();i++){
            if(listH.get(i)>listH.get(i+1)){
                maxH = listH.get(i);
            }
        }
        for(int i = 0;i<listS.size();i++){
            if(listS.get(i)>listS.get(i+1)){
                maxS = listS.get(i);
            }
        }
        if(maxH>maxS){

        }

    }

    public static void main(String[] args) {
        Main3 one = new Main3();
        one.solution();
    }
}
