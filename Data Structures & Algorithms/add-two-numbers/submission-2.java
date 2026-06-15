/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1, l2, 0);
    }

    public ListNode add(ListNode l1, ListNode l2, int remainder) {
        if (l1 == null && l2 == null) {
            if (remainder != 0)
                return new ListNode(remainder);
            else
                return null;
        }
        int val1 = 0;
        int val2 = 0;
        if (l1 != null) {
            val1 = l1.val;
        }
        if (l2 != null) {
            val2 = l2.val;
        }
        int val = val1 + val2 + remainder;
        if (val > 9) {
            remainder = 1;
            val %= 10;
        } else {
            remainder = 0;
        }

        ListNode node = new ListNode(val);
        System.out.println(val);
        if (l1 != null && l2 != null)
            node.next = add(l1.next, l2.next, remainder);
        else if (l1 == null && l2 != null)
            node.next = add(l1, l2.next, remainder);
        else if (l1 != null && l2 == null)
            node.next = add(l1.next, l2, remainder);
        
        return node;
    }


}
