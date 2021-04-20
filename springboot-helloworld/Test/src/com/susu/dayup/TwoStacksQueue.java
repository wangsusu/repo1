package com.susu.dayup;

import java.util.Stack;

public class TwoStacksQueue {
    public Stack<Integer> stackPush;
    public Stack<Integer> stackPop;

    public TwoStacksQueue() {
        stackPush = new Stack<Integer>();
        stackPop = new Stack<Integer>();
    }

    // push 栈向pop栈倒入数据
    private void pushToPop(){
       if(stackPop.empty()){ //empty状态才可以插入
           while(!stackPush.empty()){
               stackPop.push(stackPush.pop());
           }
       }
    }



}
