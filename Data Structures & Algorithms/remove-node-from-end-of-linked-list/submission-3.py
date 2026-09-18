# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        total = 0
        front = head
        for i in range(n):
            front = front.next
        
        curr = head
        if not front:
            return curr.next
        
        while front.next:
            front = front.next
            curr = curr.next
        
        curr.next = curr.next.next

        return head