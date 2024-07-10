/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {

        ListNode cur = head;
        int c = 1;

        ListNode oddhead = null;

        ListNode evenhead = null;
        ListNode evenLink = evenhead;
        ListNode oddLink = oddhead;

        if(head==null || head.next==null ||head.next.next==null )
        {
            return head;
        }

        while (cur.next != null) {
            // System.out.println(c);

            if (c % 2 == 0) {
                if (evenhead == null) {
                    evenhead = cur;
                    cur = cur.next;
                    
                    evenLink = evenhead;
                    evenLink.next = null;

                } else {
                    evenLink.next = cur;
                    cur = cur.next;
                    evenLink = evenLink.next;
                    evenLink.next = null;
                }

            } else {
                if (oddhead == null) {
                    oddhead = cur;
                    cur = cur.next;
                    oddLink = oddhead;
                    oddLink.next = null;

                } else {
                    oddLink.next = cur;
                    cur = cur.next;
                    oddLink = oddLink.next;
                    oddLink.next = null;
                }

            }

            c++;
        }

        if (c % 2 == 0) {
            evenLink.next = cur;
            evenLink = evenLink.next;
            evenLink.next = null;
        } else {
            oddLink.next = cur;
            oddLink = oddLink.next;
            oddLink.next = null;

        }
        oddLink.next = evenhead;
        // ListNode temp = evenhead;

        // while (temp.next != null) {
        //     System.out.println("temp.val: " + temp.val);
        //     temp=temp.next;
        // }
        return oddhead;

    }
}

