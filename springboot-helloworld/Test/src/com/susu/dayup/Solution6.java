package com.susu.dayup;

public class Solution6 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode n1 = dummy;
        ListNode n2 = dummy;
        for(int i = 0 ; i<=n; i++){
            n2 = n2.next;
        }
        while(n2!=null){
            n1 = n1.next;
            n2 = n2.next;
        }
        n1.next = n1.next.next;

        //printList(dummy.next);

        return dummy.next;
    }

    public static void main(String[] args) {
        /**
         * 输入：head = [1,2,3,4,5], n = 2
         * 输出：[1,2,3,5]
         */
        Solution6 sol = new Solution6();
        ListNode five = new ListNode(5);
        ListNode four = new ListNode(4,five);
        ListNode three = new ListNode(3,four);
        ListNode two = new ListNode(2,three);
        ListNode one = new ListNode(1,two);
        printList(one);
        System.out.println();

        sol.removeNthFromEnd(one,2);
    }

    // 打印链表
    public static void printList(ListNode head) {
        ListNode curNode = head;
        while(curNode != null) {
            System.out.print(curNode.val + "->");
            curNode = curNode.next;
        }
        System.out.print("NULL");
    }

}


