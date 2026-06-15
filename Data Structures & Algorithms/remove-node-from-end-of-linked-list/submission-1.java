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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        
        temp = head;
        if (len - n == 0) {
            head = head.next;
            return head;
        }
        for (int i = 0; i < len - n - 1; i++) {
            temp = temp.next;
        }
        if (temp.next != null)
            temp.next = temp.next.next;
        else {
            temp.next = null;
        }
        return head;
    }
}
