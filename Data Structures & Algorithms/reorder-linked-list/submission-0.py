# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        # Travel to middle
        second_head = head
        end = head.next
        trail_temp = head
        while end and end.next:
            end = end.next.next
            second_head = second_head.next
        
        second = second_head.next
        second_head.next = None
      
        # reverse second list
        trail = None
        while second:
            temp = second.next
            second.next = trail
            trail = second
            second = temp

        # create new list        
        first = head
        second = trail
        while second:
            temp1 = first.next
            temp2 = second.next
            first.next = second
            second.next = temp1
            first = temp1
            second = temp2

