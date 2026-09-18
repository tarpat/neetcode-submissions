# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        carry = 0
        head = ListNode()
        curr = head
        while l1 and l2:
            val = l1.val + l2.val + carry
            carry = val > 9
            curr.next = ListNode(val % 10)
            curr = curr.next
            l1 = l1.next
            l2 = l2.next
        
        if carry == 0:
            if l1:
                curr.next = l1
            if l2:
                curr.next = l2
        else:
            while l1:
                if carry == 0:
                    curr.next = l1
                    break
                
                val = l1.val + carry
                carry = val > 9
                print(val % 10)
                curr.next = ListNode(val % 10)
                l1 = l1.next
                curr = curr.next
            
            while l2:
                if carry == 0:
                    curr.next = l2
                    break

                val = l2.val + carry
                carry = val > 9
                curr.next = ListNode(val % 10)
                l2 = l2.next
                curr = curr.next
            
            if carry == 1:
                curr.next = ListNode(1)

        return head.next