# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        total = 0
        curr = head
        while curr:
            curr = curr.next
            total += 1
        k = total - n

        prev = head
        if k == 0:
            return prev.next

        for i in range(k-1):
            prev = prev.next
        
        # prev is the prev elm
        prev.next = prev.next.next

        return head