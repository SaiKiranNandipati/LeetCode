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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode start = null;
        int sum = 0;
        int carry = 0;
        ListNode temp = null;

        while (l1 != null || l2 != null || carry!=0) {
            ListNode node = new ListNode();
            if(start == null){
                 start = node;
                }
                else{
                    temp.next = node;
                }
            if (l1 != null && l2 != null) {
                sum = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l2 != null) {
                sum = l2.val + carry;
                l2 = l2.next;
            } else if (l1 != null) {
                sum = l1.val + carry;
                l1 = l1.next;
            }
            else{
                sum =carry;
            }

            if (sum >= 10) {
                sum = sum % 10;
                carry = 1;
            } else {
                carry = 0;
            }
            // System.out.println(sum);
            node.val = sum;
            temp = node;

        }

        // if (l1 != null && l2 != null) {
        //     sum = l1.val + l2.val + carry;
        // } else if (l1 == null && l2 != null) {
        //     sum = l2.val + carry;

        // } else if (l2 == null && l1 != null) {
        //     sum = l1.val + carry;
        // }

        // res.val = sum;

        return start;

    }
}


// 9,9,9,9,9,9,9

// 9,9,9,9

// 8 9 9 9 0 0 1